------------------------------------------------
------------- shopping_cart_tab   --------------
------------------------------------------------
CREATE TABLE `shopping_cart_tab`
(
    `id`         bigint(64) unsigned auto_increment primary key not null,
    `openid`     varchar(256)                        not null default '',
    `sku_id`     varchar(256)                                   not null default '',
    `sku_name`     varchar(256)                                   not null default '',
    `sku_count`  tinyint(8) unsigned                            not null default 0,
    `ctime`      int(32) unsigned                               not null default 0,
    `mtime`      int(32) unsigned                               not null default 0,
    index openid (openid)
) CHARACTER SET utf8mb4
  COLLATE utf8mb4_general_ci;
