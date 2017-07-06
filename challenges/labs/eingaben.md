
 sudo useradd -u 2010 neymar
 sudo useradd -u 2016 ronaldo
 sudo groupadd barca
 sudo groupadd merengues
 sudo usermod -a -G barca ronaldo
 sudo usermod -a -G merengues neymar
 sudo passwd neymar
 sudo passwd ronaldo
cat /etc/passwd

