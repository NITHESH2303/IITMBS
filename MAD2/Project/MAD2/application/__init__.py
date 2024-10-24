from flask import Flask
from flask_migrate import Migrate
from flask_security import Security, SQLAlchemyUserDatastore

from application.database import *
from application.models import *


def create_app():
    app = Flask(__name__)

    app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:////Users/nithesh-pt7363/Work/IITMBS/MAD2/Project/MAD2/mad.sqlite3'
    app.config['SECRET_KEY'] = 'madthemad2'
    app.config['SECURITY_PASSWORD_SALT'] = 'madthemad2salt'
    app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False

    db.init_app(app)

    user_datastore = SQLAlchemyUserDatastore(db, User, Role)
    security = Security(app, user_datastore)

    migrate = Migrate(app, db)

    with app.app_context():
        print(f"Registered Models: {db.metadata.tables.keys()}")
        db.create_all()

    print(f"SQLite database path: {app.config['SQLALCHEMY_DATABASE_URI']}")

    return app
