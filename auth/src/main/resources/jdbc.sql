 create table users(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    username varchar(50) not null,
    password varchar(500) not null,
    enabled boolean not null);

  create table authorities (
     id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
     username varchar(50) not null,
     authority varchar(50) not null,
     );

   INSERT INTO `securityjdbc`.`users` (`username`, `password`, `enabled`) VALUES ('adonis', '12345', '1');
INSERT INTO `securityjdbc`.`authorities` (`username`, `authority`) VALUES ('adonis', 'admin');
