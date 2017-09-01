CREATE TABLE IF NOT EXISTS users(
id INT NOT NULL,
username VARCHAR(100) NULL,
password VARCHAR(100) NULL,
password_salt VARCHAR(100) NULL,
PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS user_roles(
role_id INT NOT NULL,
role_name VARCHAR(100) NULL,
users_id INT NOT NULL,
PRIMARY KEY(role_id),
INDEX fk_user_roles_users1_idx(users_id ASC),
CONSTRAINT fk_user_roles_users1 FOREIGN KEY(users_id)REFERENCES users(id)
ON DELETE NO ACTION ON UPDATE
NO ACTION
);

CREATE
TABLE
IF
NOT
EXISTS

roles_permissions
 (
permission
VARCHAR
(
100
)
NULL
,
p_id
INT
NOT
NULL
,
user_roles_role_id
INT
NOT
NULL
,
PRIMARY
KEY
 (
p_id
),
INDEX
fk_roles_permissions_user_roles1_idx
 (
user_roles_role_id
ASC
),
CONSTRAINT
fk_roles_permissions_user_roles1
FOREIGN
KEY
 (
user_roles_role_id
)
REFERENCES
user_roles
 (
role_id
)
ON
DELETE
NO
ACTION
ON
UPDATE
NO
ACTION
);
