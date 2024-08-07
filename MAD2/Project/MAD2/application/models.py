from application.database import db
from datetime import datetime


class UserRoles(db.Model):
    __tablename__ = 'user_roles'
    id = db.Column(db.Integer, primary_key=True)
    user_id = db.Column(db.Integer, db.ForeignKey('user.id'))
    role_id = db.Column(db.Integer, db.ForeignKey('role.id'))


class Role(db.Model):
    __tablename__ = 'role'
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(255), unique=True)
    description = db.Column(db.String(255), unique=True)


class User(db.Model):
    __tablename__ = 'user'
    id = db.Column(db.Integer, primary_key=True, autoincrement=True)
    first_name = db.Column(db.String, nullable=False)
    last_name = db.Column(db.String)
    email = db.Column(db.String, unique=True, nullable=False)
    password = db.Column(db.String, nullable=False)
    created_on = db.Column(db.DateTime, default=datetime.utcnow)
    last_login = db.Column(db.DateTime, default=datetime.utcnow)
    image = db.Column(db.String)
    roles = db.relationship('Role', secondary='user_roles', backref='users')
    fs_uniquifier = db.Column(db.String(64), nullable=False, unique=True)


class Sponsor(db.Model):
    __tablename__ = 'sponsor'
    id = db.Column(db.Integer, primary_key=True, autoincrement=True)
    user_id = db.Column(db.Integer, db.ForeignKey('user.id'), nullable=False)
    company_name = db.Column(db.String, nullable=False)
    industry_type = db.Column(db.String, nullable=False)
    description = db.Column(db.String, nullable=False)
    campaigns = db.relationship('Campaign', backref='sponsor', lazy=True)


class Influencer(db.Model):
    __tablename__ = 'influencer'
    id = db.Column(db.Integer, primary_key=True, autoincrement=True)
    user_id = db.Column(db.Integer, db.ForeignKey('user.id'), nullable=False)
    user_name = db.Column(db.String, nullable=False)
    about = db.Column(db.String, default="")
    followers = db.Column(db.Integer, nullable=False)
    ads = db.relationship('Ads', backref='influencer', lazy=True)


class Campaign(db.Model):
    __tablename__ = 'campaign'
    id = db.Column(db.Integer, primary_key=True, autoincrement=True)
    sponsor_id = db.Column(db.Integer, db.ForeignKey('sponsor.id'), nullable=False)
    name = db.Column(db.String, nullable=False)
    description = db.Column(db.String, nullable=False)
    start_date = db.Column(db.DateTime, nullable=False)
    end_date = db.Column(db.DateTime, nullable=False)
    status = db.Column(db.Boolean, default=True)
    visibility = db.Column(db.String, nullable=False, default='private')
    ads = db.relationship('Ads', backref='campaign', lazy=True)


class Ads(db.Model):
    __tablename__ = 'ads'
    id = db.Column(db.Integer, primary_key=True, autoincrement=True)
    campaign_id = db.Column(db.Integer, db.ForeignKey('campaign.id'), nullable=False)
    influencer_id = db.Column(db.Integer, db.ForeignKey('influencer.id'), nullable=False)
    status = db.Column(db.String, nullable=False, default='Pending')
    request = db.Column(db.String, nullable=False)
    amount = db.Column(db.Integer, nullable=False)
    requirement = db.Column(db.String, nullable=False)
    messages = db.Column(db.String)
