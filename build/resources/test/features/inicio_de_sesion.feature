#language: es
Característica: Inicio de sesión en el aplicativo siigo
  Yo como usuario del aplicativo
  Quiero iniciar session
  Para verificar su funcionamiento

  @LoginExitoso
  Escenario: Auntenticacion Exitosa Usuario
    Dado que se ingresa al login del aplicativo
    Cuando Juan digita el usuario retoautomationsiigo@yopmail.com y la clave T4b4ck0ff1c3P455w0rd658*
    Entonces el puede observar el ingreso al aplicativo


