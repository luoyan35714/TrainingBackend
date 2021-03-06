-- ----------------------------------
-- ----------------------------------
-- ---Training
-- ----------------------------------
-- ----------------------------------
CREATE TABLE `MicroServiceDev`.`training` (
  `ID` INT (11) NOT NULL,
  `TRAINING_PLAN_ID` INT (11) NOT NULL,
  `TRAINING_STATE_IND` INT (11) NOT NULL DEFAULT '0' COMMENT '0-PLANNED 1-IN-PROGRESS 2-CANCELLED 3-CONFIRMED 4-TRAIN STARTED 5-TRAIN FINISHED 6-SEND FEEDBACK TO TRAINEE/COMPLETED',
  `TRAINING_TITLE` VARCHAR (200) NOT NULL DEFAULT '',
  `TRAINING_START_TIME` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `TRAINING_END_TIME` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `TRAINING_DURATION` INT (11) NOT NULL DEFAULT '0' COMMENT 'THIS IS CALCULATED BY MINUTES',
  `TRAINING_LOCATION` VARCHAR (200) NOT NULL DEFAULT '',
  `TRAINING_DESCRIPTION` TEXT NOT NULL,
  `TRAINER` VARCHAR (500) NOT NULL DEFAULT '' COMMENT 'E.G. TRAINER1_ID:TRAINER_NAME|TRAINER2_ID:TRAINER_NAME',
  `TRAINING_MATERIAL` TEXT NOT NULL,
  `TRAINING_VIDEO` TEXT NOT NULL,
  `CREATOR_ID` INT (11) NOT NULL DEFAULT '0',
  `CREATOR` VARCHAR (45) NOT NULL DEFAULT '',
  `CREATE_DATE` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UPDATED_BY_ID` INT (11) NOT NULL DEFAULT '0',
  `UPDATED_BY` VARCHAR (45) NOT NULL DEFAULT '',
  `LAST_UPDATE_DATE` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `DELETED_IND` INT (11) NOT NULL DEFAULT '0',
  `DELETED_BY` VARCHAR (45) NOT NULL DEFAULT '',
  `DELETED_BY_ID` INT (11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE = INNODB DEFAULT CHARSET = utf8;

INSERT INTO `MICROSERVICEDEV`.`TRAINING` (
  `ID`,
  `TRAINING_PLAN_ID`,
  `TRAINING_STATE_IND`,
  `TRAINING_TITLE`,
  `TRAINING_START_TIME`,
  `TRAINING_END_TIME`,
  `TRAINING_DURATION`,
  `TRAINING_LOCATION`,
  `TRAINING_DESCRIPTION`,
  `TRAINER`,
  `TRAINING_MATERIAL`,
  `TRAINING_VIDEO`,
  `CREATOR_ID`,
  `CREATOR`,
  `CREATE_DATE`,
  `UPDATED_BY_ID`,
  `UPDATED_BY`,
  `LAST_UPDATE_DATE`,
  `DELETED_IND`,
  `DELETED_BY`,
  `DELETED_BY_ID`
) 
VALUES
  (
    1,
    201801,
    0,
    'Training1',
    '20180505',
    '20180505',
    120,
    '24#9T001',
    'Training description 01',
    '1:test.trainer',
    '',
    '',
    1,
    'admin',
    CURRENT_TIMESTAMP,
    1,
    'admin',
    CURRENT_TIMESTAMP,
    0,
    '',
    0
  ) ;

-- ----------------------------------
-- ----------------------------------
-- ---Training-History
-- ----------------------------------
-- ----------------------------------
CREATE TABLE `MicroServiceDev`.`training_history` (
  `ID` INT (11) NOT NULL,
  `TRAINING_ID` INT (11) NOT NULL DEFAULT '0' COMMENT 'training.ID',
  `TRAINING_STATE_IND` INT (11) NOT NULL DEFAULT '0' COMMENT 'training.TRAINING_STATE_IND, 0-PLANNED 1-IN-PROGRESS 2-CANCELLED 3-CONFIRMED 4-TRAIN STARTED 5-TRAIN FINISHED 6-SEND FEEDBACK TO TRAINEE/COMPLETED',
  `TRAINING_TITLE` VARCHAR (200) NOT NULL DEFAULT '' COMMENT 'training.TRAINING_TITLE',
  `TRAINIER` VARCHAR (500) NOT NULL DEFAULT '' COMMENT 'training.TRAINIER, E.G. TRAINER1_ID:TRAINER_NAME|TRAINER2_ID:TRAINER_NAME',
  `TRAINING_START_TIME` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'training.TRAINING_START_TIME',
  `TRAINING_END_TIME` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'training.TRAINING_END_TIME',
  `TRAINING_DURATION` INT (11) NOT NULL DEFAULT '0' COMMENT 'training.TRAINING_DURATION, THIS IS CALCULATED BY MINUTES',
  `TRAINING_LOCATION` VARCHAR (200) NOT NULL DEFAULT '' COMMENT 'training.TRAINING_LOCATION',
  `TRAINEE_ID` VARCHAR (45) NOT NULL DEFAULT '' COMMENT 'user.ID',
  `TRAINEE_STATE_IND` CHAR(1) NOT NULL DEFAULT '' COMMENT '0-REGISTER SUCCESSFULLY 1-SELF CANCEL THE TRAINING 2-NO SHOW 3-PENDING FEEDBACK 4-COMPLETED',
  `CREATOR_ID` INT (11) NOT NULL DEFAULT '0',
  `CREATOR` VARCHAR (45) NOT NULL DEFAULT '',
  `CREATE_DATE` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UPDATED_BY_ID` INT (11) NOT NULL DEFAULT '0',
  `UPDATED_BY` VARCHAR (45) NOT NULL DEFAULT '',
  `LAST_UPDATE_DATE` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `DELETED_IND` INT (11) NOT NULL DEFAULT '0',
  `DELETED_BY` VARCHAR (45) NOT NULL DEFAULT '',
  `DELETED_BY_ID` INT (11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`)
) ;

INSERT INTO `microservicedev`.`training_history` (
  `ID`,
  `TRAINING_ID`,
  `TRAINING_STATE_IND`,
  `TRAINING_TITLE`,
  `TRAINIER`,
  `TRAINING_START_TIME`,
  `TRAINING_END_TIME`,
  `TRAINING_DURATION`,
  `TRAINING_LOCATION`,
  `TRAINEE_ID`,
  `TRAINEE_STATE_IND`,
  `CREATOR_ID`,
  `CREATOR`,
  `CREATE_DATE`
) 
VALUES
  (
    1,
    1000001,
    0,
    'course 1',
    '1:xiaohui.c.liu',
    '2018-06-10 9:00:00',
    '2018-06-10 12:00:00',
    180,
    '24#9M001',
    5000001,
    0,
    2,
    'fangzhou.li',
    CURRENT_TIMESTAMP
  ) ;

INSERT INTO `microservicedev`.`training_history` (
  `ID`,
  `TRAINING_ID`,
  `TRAINING_STATE_IND`,
  `TRAINING_TITLE`,
  `TRAINIER`,
  `TRAINING_START_TIME`,
  `TRAINING_END_TIME`,
  `TRAINING_DURATION`,
  `TRAINING_LOCATION`,
  `TRAINEE_ID`,
  `TRAINEE_STATE_IND`,
  `CREATOR_ID`,
  `CREATOR`,
  `CREATE_DATE`
) 
VALUES
  (
    2,
    1000002,
    0,
    'course 2',
    '1:xiaohui.c.liu',
    '2018-06-10 13:00:00',
    '2018-06-10 15:00:00',
    180,
    '24#9M001',
    5000001,
    0,
    2,
    'fangzhou.li',
    CURRENT_TIMESTAMP
  ) ;

INSERT INTO `microservicedev`.`training_history` (
  `ID`,
  `TRAINING_ID`,
  `TRAINING_STATE_IND`,
  `TRAINING_TITLE`,
  `TRAINIER`,
  `TRAINING_START_TIME`,
  `TRAINING_END_TIME`,
  `TRAINING_DURATION`,
  `TRAINING_LOCATION`,
  `TRAINEE_ID`,
  `TRAINEE_STATE_IND`,
  `CREATOR_ID`,
  `CREATOR`,
  `CREATE_DATE`
) 
VALUES
  (
    3,
    1000003,
    0,
    'course 3',
    '1:xiaohui.c.liu',
    '2018-06-11 9:00:00',
    '2018-06-11 12:00:00',
    180,
    '24#9M001',
    5000001,
    0,
    2,
    'fangzhou.li',
    CURRENT_TIMESTAMP
  ) ;

