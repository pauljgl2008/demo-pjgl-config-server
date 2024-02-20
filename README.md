# demo-pjgl-config-server
demo-pjgl-config-server


# Docker:
- $ docker buildx build -t pjgl-config-server .

Correr la imagen de RabbitMQ antes de iniciar el micro:
- $ docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.12-management

# Install scoope:
Github repo: https://github.com/ScoopInstaller/Install#readme
1. $ Set-ExecutionPolicy -ExecutionPolicy RemoteSigned -Scope CurrentUser 
2. $ irm get.scoop.sh | iex

# Configure hookdeck para el WebHook de GitHub
Link: https://console.hookdeck.com/

Step 1: Install with Scoop
1. $ scoop bucket add hookdeck https://github.com/hookdeck/scoop-hookdeck-cli.git
2. $ scoop install hookdeck

Step 2: Login and start the CLI with those commands
1. $ hookdeck login --cli-key 1uvbre30i2l2bucyu20xhtbbntqknv7p5c1vunmgc1pd5iznlt
2. $ hookdeck listen [port-config-server] Source
   Example: $ hookdeck listen 8085 Source
3. PS C:\Users\pguevarl> hookdeck listen 8085 Source
   - ? What path should the webhooks be forwarded to (ie: /webhooks)? /monitor
   - ? What's your connection label (ie: My API)? localhost
   - Dashboard
   - 👉 Inspect and replay webhooks: https://console.hookdeck.com?source_id=src_xp5emc10mixqlr
   - Source Source
   - 🔌 Webhook URL: https://hkdk.events/xp5emc10mixqlr
   - Connections
   - localhost forwarding to /monitor
   - Ready! (^C to quit)
   - 2024-02-13 21:53:22 [404] POST http://localhost:8085/monitor | https://console.hookdeck.com/?event_id=evt_0LojaWscGXI4VtOXg4