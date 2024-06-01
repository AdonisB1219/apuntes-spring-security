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



CREATE TABLE `customer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `role` varchar(30) NOT NULL,
  `password` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
)


INSERT INTO `securitydb`.`customer` (`username`, `email`, `role`, `password`) VALUES ('adonis', 'adonis@gmail.com', 'admin', '12345');
