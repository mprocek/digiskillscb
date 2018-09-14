INSERT INTO Employee (first_name, last_name) VALUES ('Krzysztof','Smigielski'); --1
INSERT INTO Employee (first_name, last_name) VALUES ('Łukasz','Kosmacz'); --2
INSERT INTO Employee (first_name, last_name) VALUES ('Krzysztof','Nawelski'); --3
INSERT INTO Employee (first_name, last_name) VALUES ('Piotr','Uniejewski'); --4
INSERT INTO Employee (first_name, last_name) VALUES ('Marek','Procek'); --5
INSERT INTO Skill (skilldesc) VALUES ('java'); --1
INSERT INTO Skill (skilldesc) VALUES ('sql'); --2
INSERT INTO Skill (skilldesc) VALUES ('platnosci'); --3
INSERT INTO Skill (skilldesc) VALUES ('innowacje'); --4
INSERT INTO Skill (skilldesc) VALUES ('fintech'); --5
INSERT INTO Skill (skilldesc) VALUES ('ki'); --6
INSERT INTO Skill (skilldesc) VALUES ('ux'); --7
INSERT INTO Skill (skilldesc) VALUES ('bankowość internetowa'); --8
INSERT INTO Skill (skilldesc) VALUES ('bpmn'); --9
INSERT INTO Skill (skilldesc) VALUES ('agile'); --10
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('1','6');
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('1','8');
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('1','9');
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('1','10');
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('2','3');
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('2','5');
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('2','6');
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('3','4');
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('3','5');
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('3','7');
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('3','10');
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('3','6');
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('4','3');
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('4','6');
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('4','5');
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('5','1');
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('5','2');
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('5','8');
INSERT INTO Employee_Skill (employee_id,skill_id) VALUES ('5','6');