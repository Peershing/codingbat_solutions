import mysql.connector

db = mysql.connector.connect(
    host="localhost",
    user="root",
    passwd="root",
    database="industry_one"
)

ents = [
    ("Igor Rybakov", 49),
    ("Warren Buffet", 91),
    ("Michal Solowow", 60),
    ("Marcin Iwinski", 47),
]

comps = [
    ("Synthos", 3600, 3),
    ("Prytek", 500, 1),
    ("CD Projekt", 1111, 4),
    ("Berkshire Hathaway", 360000, 2),
]

cursor_a = db.cursor(buffered=True)

q0 = "CREATE DATABASE industry_one"
q1 = "CREATE TABLE Entrepreneurs (personId int PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), age smallint UNSIGNED)"
q2 = "CREATE TABLE Companies (companyId int PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), headcount int UNSIGNED," \
     "ceoId int, FOREIGN KEY (ceoId) REFERENCES Entrepreneurs(personId))"
q3 = "SHOW TABLES"
q4 = "DROP TABLE IF EXISTS Companies"
q5 = "DROP TABLE IF EXISTS Entrepreneurs"
q6 = "DESCRIBE Companies"
q7 = "DESCRIBE Entrepreneurs"
q8 = "SELECT * FROM Entrepreneurs"
q13 = "SELECT * FROM Companies"
q9 = "SELECT companyId, name, headcount FROM Companies WHERE name LIKE '%CD%'"
q10 = "UPDATE Entrepreneurs SET name='Martin Iwinski' WHERE name='Marcin Iwinski'"
q11 = "SELECT Entrepreneurs.name, SUM(headcount) FROM Entrepreneurs, Companies " \
      "WHERE Entrepreneurs.personId=Companies.ceoId GROUP BY Entrepreneurs.personId ORDER BY SUM(headcount) DESC"
q12 = "DELETE FROM Companies WHERE companyId=2"
cursor_a.execute(q13)

q11 = "INSERT INTO Entrepreneurs (name, age) VALUES (%s, %s)"
q12 = "INSERT INTO Companies (name, headcount, ceoId) VALUES (%s, %s, %s)"
# cursor_a.executemany()

db.commit()
for x in cursor_a:
    print(x)
