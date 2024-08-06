from flask import Flask
from flask_sqlalchemy import SQLAlchemy
from flask_security import Security, SQLAlchemyUserDatastore
from application.models import User, Role, UserRoles, Sponsor, Influencer, Campaign, Ads
from flask_migrate import Migrate

db = SQLAlchemy()


def create_app():
    app = Flask(__name__)

    app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///mad2.db'
    app.config['SECRET_KEY'] = 'super-secret'
    app.config['SECURITY_PASSWORD_SALT'] = 'super-secret-salt'
    app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False

    db.init_app(app)

    user_datastore = SQLAlchemyUserDatastore(db, User, Role)
    security = Security(app, user_datastore)

    migrate = Migrate(app, db)

    with app.app_context():
        db.create_all()

    print(f"SQLite database path: {app.config['SQLALCHEMY_DATABASE_URI']}")

    return app
