
DROP TABLE IF EXISTS users;

CREATE TABLE users (
  user_id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  mail VARCHAR(250) NOT NULL
);


INSERT INTO users (user_id, name, mail) VALUES
  (1, 'Bianca', 'bianca.carp@fortech.ro');