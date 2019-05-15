CREATE USER 'geek'@'localhost' IDENTIFIED BY 'geek';
GRANT ALL PRIVILEGES ON * . * TO 'geek'@'localhost';
===
CREATE SCHEMA IF NOT EXISTS `geek_library`;
===
DROP TABLE IF EXISTS `geek_library`.`students`;

CREATE TABLE IF NOT EXISTS `geek_library`.`students`  (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(100) DEFAULT NULL,
    PRIMARY KEY(id)
) ENGINE=InnoDB CHARSET=utf8;
===
DROP TABLE IF EXISTS `geek_library`.`courses`;

CREATE TABLE IF NOT EXISTS `geek_library`.`courses`  (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) DEFAULT NULL,
  PRIMARY KEY(id)
) ENGINE=InnoDB CHARSET=utf8;
===
DROP TABLE IF EXISTS `geek_library`.`students_courses`;

CREATE TABLE IF NOT EXISTS `geek_library`.`students_courses`  (
`student_id` INT(11) NOT NULL,
`course_id` INT(11) NOT NULL,

PRIMARY KEY (`student_id`, `course_id`),

CONSTRAINT FK_STUDENT FOREIGN KEY (`student_id`)
  REFERENCES `geek_library`.`students` (`id`)
  ON DELETE CASCADE ,

CONSTRAINT FK_COURSE FOREIGN KEY (`course_id`)
  REFERENCES `geek_library`.`courses` (`id`)
  ON DELETE CASCADE

) ENGINE=InnoDB CHARSET=utf8;
