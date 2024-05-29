------------------------------------------------
------------- users_tab user info --------------
------------------------------------------------
CREATE TABLE `users_tab`
(
    `id`         bigint(64) auto_increment primary key not null,
    `openid`     varchar(256) unique key not null default '',
    `nickname`   varchar(256) not null default '',
    `phone`      varchar(64)  not null default '',
    `avatar_url` varchar(512) not null default '',
    `ctime`      bigint(64) not null default 0,
    `mtime`      bigint(64) not null default 0
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

------------------------------------------------
-- user_session_tab  openid and session_key ----
------------------------------------------------
CREATE TABLE `user_session_tab`
(
    `id`          bigint(64) auto_increment primary key not null,
    `openid`      varchar(256)  not null default '',
    `session_key` varchar(256) not null default '',
    `ctime`       bigint(64) not null default 0,
    `mtime`       bigint(64) not null default 0,
    unique key (openid, session_key)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
---- 此唯一键存在字符过长问题
------------------------------------------------
----------- user_shipping_address_tab ----------
------------------------------------------------
CREATE TABLE `user_shipping_address_tab`
(
    `id`      bigint(64) auto_increment primary key not null,
    `openid`  varchar(256)  not null default '',
    `address` varchar(1024) not null default '',
    `ctime`   bigint(64) not null default 0,
    `mtime`   bigint(64) not null default 0
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

