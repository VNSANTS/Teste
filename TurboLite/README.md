# TurboLite Beta 0.1

Aplicativo Android experimental para solicitar a parada forçada de aplicativos instalados pelo usuário, sem root, usando Shizuku com privilégios ADB.

## Limites da beta

- Fecha apps de usuário que aparecem no launcher, exceto o próprio TurboLite.
- Não tenta parar pacotes de sistema.
- Não limpa cache individual: isso não é permitido para um app comum/ADB em todos os aparelhos sem riscos ou privilégios adicionais. **Não use `pm clear`**: ele apaga dados e logins.
- Não ativa automaticamente o modo gamer do fabricante.
- O Android pode reiniciar apps e serviços, e parar apps pode interromper downloads, música, VPN, alarmes de terceiros ou notificações.
- A execução em lote é experimental. Confira o resultado no seu aparelho.

## Instalação

1. Instale o **Shizuku** pela fonte oficial: https://shizuku.rikka.app/
2. No Android 14, ative Opções do desenvolvedor e Depuração sem fio.
3. Inicie o serviço do Shizuku por Depuração sem fio (normalmente sem PC; após reiniciar o telefone, pode ser necessário iniciar de novo).
4. Instale o APK de TurboLite Beta gerado pelo GitHub Actions.
5. Abra o app e conceda a permissão solicitada pelo Shizuku.
6. Toque em **FECHAR APPS EM SEGUNDO PLANO**.

## Build

GitHub Actions compila `app-debug.apk` em cada push que altere a pasta `TurboLite/` ou o workflow de build. O APK aparece como artifact do workflow.
