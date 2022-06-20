//new Error(message)

/*
const MeuErro = new Error('Mensagem Inválida - linha 4');
throw MeuErro;

ou:
*/
const MeuErro = new Error('Mensagem Inválida - linha 9');
MeuErro.name = 'InvalidMessage';
throw MeuErro;