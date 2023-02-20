INSERT INTO Teachers(teachers_id, surname, name, lastname, birthday, gender, object) values (0, 'parenko', 'viktor', 'ivanovich', 1972, 'm', 'history');
INSERT INTO Teachers(teachers_id, surname, name, lastname, birthday, gender, object) values (1, 'pesenko', 'stepan', 'stepanovich', 1976, 'm', 'history');
INSERT INTO Teachers(teachers_id, surname, name, lastname, birthday, gender, object) values (2, 'arhipenkov', 'nikolay', 'ivanovich', 1968, 'm', 'history');
INSERT INTO Teachers(teachers_id, surname, name, lastname, birthday, gender, object) values (3, 'boss', 'vadim', 'genadevith', 1966, 'm', 'history');
INSERT INTO Teachers(teachers_id, surname, name, lastname, birthday, gender, object) values (4, 'matveev', 'igor', 'ivanovich', 1968, 'm', 'history');
INSERT INTO Teachers(teachers_id, surname, name, lastname, birthday, gender, object) values (5, 'ivanov', 'artem', 'petrovich', 1973, 'm', 'history');

INSERT INTO Students(students_id, surname, name, lastname, birthday, gender) values (0, 'petrov', 'alex', 'stepanovich', 1996, 'm');
INSERT INTO Students(students_id, surname, name, lastname, birthday, gender) values (1, 'gaponov', 'viktor', 'sergeevith', 1996, 'm');
INSERT INTO Students(students_id, surname, name, lastname, birthday, gender) values (2, 'gordeev', 'alexey', 'genadevith', 1995, 'm');
INSERT INTO Students(students_id, surname, name, lastname, birthday, gender) values (3, 'kiselevich', 'albina', 'alexandrovna', 1994, 'f');
INSERT INTO Students(students_id, surname, name, lastname, birthday, gender) values (5, 'mashkov', 'sergey', 'petrovich', 1997, 'm');
INSERT INTO Students(students_id, surname, name, lastname, birthday, gender) values (6, 'perov', 'vadim', 'vladimirovith', 1997, 'm');

INSERT INTO Forms(id, year, code, teachers_id, students_id) values (0, 2012, 'a', 0, ARRAY [0,1,2,3,4]);

