use vospace;
truncate table nodes;
truncate table properties;
truncate table jobs;
truncate table transfers;
truncate table results;
truncate table capabilities;
insert into nodes(identifier, type, location, creationDate, node) values('vos://nvo.caltech!vospace', 3, '/Users/mjg/Projects/noao/vospace/data', now(), '<node xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="vos:ContainerNode" uri="vos://nvo.caltech!vospace" xmlns="http://www.ivoa.net/xml/VOSpace/v2.0"> <properties> <property uri="ivo://ivoa.net/vospace/core#date">2015-01-01T00:00:00.000-0800</property> <property readOnly="false" uri="ivo://ivoa.net/vospace/core#ispublic">true</property> <property readOnly="false" uri="ivo://ivoa.net/vospace/core#groupread">quest</property> <property readOnly="false" uri="ivo://ivoa.net/vospace/core#groupwrite">quest</property> </properties> <accepts/> <provides/> <capabilities/> <nodes/> </node>');
insert into properties values('vos://nvo.caltech!vospace', 'ivo://ivoa.net/vospace/core#date', '2015-01-01T00:00:00.000-0800');
insert into properties values('vos://nvo.caltech!vospace', 'ivo://ivoa.net/vospace/core#groupread', 'quest');
insert into properties values('vos://nvo.caltech!vospace', 'ivo://ivoa.net/vospace/core#groupwrite', 'quest');
insert into properties values('vos://nvo.caltech!vospace', 'ivo://ivoa.net/vospace/core#ispublic', 'true');
insert into nodes(identifier, type, location, creationDate, node) values('vos://nvo.caltech!vospace/node12', 1, '/Users/mjg/Projects/noao/vospace/data/node12', now(), '<node xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="vos:DataNode" uri="vos://nvo.caltech!vospace/node12" xmlns="http://www.ivoa.net/xml/VOSpace/v2.0"> <properties> <property uri="ivo://ivoa.net/vospace/core#date">2015-01-01T00:00:00.000-0800</property> <property readOnly="false" uri="ivo://ivoa.net/vospace/core#ispublic">true</property> <property readOnly="false" uri="ivo://ivoa.net/vospace/core#groupread">quest</property> <property readOnly="false" uri="ivo://ivoa.net/vospace/core#groupwrite">quest</property> </properties> <accepts/> <provides/> <capabilities/> </node>');
insert into properties values('vos://nvo.caltech!vospace/node12', 'ivo://ivoa.net/vospace/core#date', '2015-01-01T00:00:00.000-0800');
insert into properties values('vos://nvo.caltech!vospace/node12', 'ivo://ivoa.net/vospace/core#groupread', 'quest');
insert into properties values('vos://nvo.caltech!vospace/node12', 'ivo://ivoa.net/vospace/core#groupwrite', 'quest');
insert into properties values('vos://nvo.caltech!vospace/node12', 'ivo://ivoa.net/vospace/core#ispublic', 'true');
drop database mydb;
create database mydb;


