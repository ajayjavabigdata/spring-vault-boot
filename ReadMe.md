This is a Spring boot application having vault for reading teh encrypted configuration using vault token.


Install Vault::
Go to https://www.vaultproject.io/downloads.html    and for windows 64 version select  windows 64 and down load it.
unzip the downloaded software to a folder
go to the folder using cmd and cd command 
and run the below commands for vault


vault server --dev --dev-root-token-id="00000000-0000-0000-0000-000000000000" &

open  http://127.0.0.1:8200

and enter the Token value as "00000000-0000-0000-0000-000000000000"


Open another command prompt from same directory

set VAULT_TOKEN=00000000-0000-0000-0000-000000000000
set VAULT_ADDR=http://127.0.0.1:8200
vault kv put secret/spring-vault-boot test.username=testouser test.password=testpassword
vault kv put secret/spring-vault-boot/cloud test.username=clouduser test.password=cloudpassword

you can see both entries below
http://127.0.0.1:8200/ui/vault/secrets/secret/list



2019-10-23 15:08:57.513  INFO 17716 --- [           main] com.spring.vault.boot.ApplicationVault   : Started ApplicationVault in 3.75 seconds (JVM running for 4.741)
2019-10-23 15:08:57.521  INFO 17716 --- [           main] com.spring.vault.boot.ApplicationVault   :   test.username is testouser
2019-10-23 15:08:57.522  INFO 17716 --- [           main] com.spring.vault.boot.ApplicationVault   :   test.password is testpassword

