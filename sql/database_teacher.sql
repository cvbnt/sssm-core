create table teacher
(
    id             int auto_increment comment '主键'
        primary key,
    schoolId       int          not null comment '学校ID',
    teacherCode    varchar(50)  not null comment '教师代码',
    avatar         varchar(500) null comment '头像',
    name           varchar(20)  not null comment '名字
',
    sex            int          null comment '性别(1为男,0为女)',
    title          varchar(50)  not null comment '职级',
    subject        varchar(50)  not null comment '学科',
    phone          varchar(20)  null comment '手机号',
    startTeachDate datetime     not null comment '入职时间',
    createAt       datetime     not null comment '创建时间',
    updateAt       datetime     not null comment '更新时间'
)
    charset = utf8;

create index teacher_id_index
    on teacher (id);

INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (1, 1, '10001', '二寸', '刘一', 1, '三级教师', '语文', '13100000000', '1999-12-31 16:00:00', '1999-12-31 16:00:00', '2010-01-01 16:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (2, 2, '10002', '一寸', '陈二', 0, '二级教师', '数学', '13100000001', '2000-01-01 16:00:00', '2000-01-02 16:00:00', '2010-01-01 16:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (3, 3, '10003', '一寸', '你好', 1, '一级教师', '英语', '13100000002', '2000-01-03 00:00:00', '2000-01-03 00:00:00', '2010-01-03 00:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (4, 4, '10004', '一寸', '李四', 0, '三级教师', '语文', '13100000003', '2000-01-04 00:00:00', '2000-01-04 00:00:00', '2000-01-04 00:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (5, 5, '10005', '一寸', '王五', 0, '二级教师', '数学', '13100000004', '2000-01-05 00:00:00', '2000-01-05 00:00:00', '2000-01-05 00:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (6, 6, '10006', '一寸', '赵六', 1, '一级教师', '英语', '13100000005', '2000-01-06 00:00:00', '2000-01-06 00:00:00', '2000-01-06 00:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (7, 7, '10007', '一寸', '孙七', 0, '三级教师', '语文', '13100000006', '2000-01-07 00:00:00', '2000-01-07 00:00:00', '2000-01-07 00:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (8, 8, '10008', '一寸', '周八', 1, '二级教师', '数学', '13100000007', '2000-01-08 00:00:00', '2000-01-08 00:00:00', '2000-01-08 00:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (9, 9, '10009', '一寸', '吴九', 0, '一级教师', '英语', '13100000008', '2000-01-09 00:00:00', '2000-01-09 00:00:00', '2000-01-09 00:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (10, 10, '10010', '一寸', '郑十', 1, '三级教师', '语文', '13100000009', '2000-01-10 00:00:00', '2000-01-10 00:00:00', '2000-01-10 00:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (11, 11, '10011', '一寸', '甲戌', 0, '二级教师', '数学', '13100000010', '2000-01-11 00:00:00', '2000-01-11 00:00:00', '2000-01-11 00:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (12, 12, '10012', '一寸', '乙亥', 1, '一级教师', '英语', '13100000011', '2000-01-12 00:00:00', '2000-01-12 00:00:00', '2000-01-12 00:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (13, 13, '10013', '一寸', '丙子', 0, '三级教师', '语文', '13100000012', '2000-01-13 00:00:00', '2000-01-13 00:00:00', '2000-01-13 00:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (14, 14, '10014', '一寸', '丁丑', 1, '二级教师', '数学', '13100000013', '2000-01-14 00:00:00', '2000-01-14 00:00:00', '2000-01-14 00:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (15, 15, '10015', '一寸', '戊寅', 0, '一级教师', '英语', '13100000014', '2000-01-15 00:00:00', '2000-01-15 00:00:00', '2000-01-15 00:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (16, 16, '10016', '一寸', '己卯', 1, '三级教师', '语文', '13100000015', '2000-01-16 00:00:00', '2000-01-16 00:00:00', '2000-01-16 00:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (17, 17, '10017', '一寸', '庚辰', 0, '二级教师', '数学', '13100000016', '2000-01-16 16:00:00', '2000-01-16 16:00:00', '2000-01-16 16:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (18, 18, '100018', '一寸', '夏侯惇', 1, '武将', '武术', '13100000018', '2020-10-09 16:00:00', '2020-10-09 16:00:00', '2020-10-09 16:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (19, 19, '10019', '一寸', '姜维', 1, '武将', '武术', '13100000019', '2020-10-09 16:00:00', '2020-10-09 16:00:00', '2020-10-09 16:00:00');
INSERT INTO `database`.teacher (id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt) VALUES (20, 20, '10020', '一寸', '邓艾', 1, '武将', '武术', '13100000019', '2020-10-09 16:00:00', '2020-10-09 16:00:00', '2020-10-09 16:00:00');