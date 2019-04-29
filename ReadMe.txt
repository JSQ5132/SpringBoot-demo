springBoot 的默认配置文件是application.properties，但是为了更简便可以使用application.yml的配置文件来替代。
使用application.yml配置文件必须遵循yml文件的语法。
server:
    port: 8082
    context-path: /springBootDemo
即属性名与值之间必须加上一个空格，在实际开发中推荐使用yml文件来配置。
