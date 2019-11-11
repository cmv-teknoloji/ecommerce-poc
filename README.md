# ecommerce-poc


![alt text](https://github.com/cmv-teknoloji/ecommerce-poc/blob/master/Tcell_ECommerce.png)


proje clean install yapıldıkdan sonra,
ilk çalıştırılması gereken Eureka ve ConfigServer modulleri,
daha sonra Cargo, core, ui, schedule projeleri maven-spring-boot plugini ile run edilimeli. configservere erişemezse fail olur.


parent proje klasorunde zipkin.jar mevcut onu da java -jar ile çalıştırın. default portu 9941;
http://localhost:9411/zipkin/ üzerinden modulleri arası haberleşme görülebilir.

her module random port üzerinden çalışır. Eureka üzerinden UI portu bulunabilir.
Eureka portu vermezseniz, default port üzerinden çalışır.
http://localhost:8282/