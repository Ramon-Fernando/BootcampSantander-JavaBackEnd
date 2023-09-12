# 💻 Bootcamp Santander - Trilha Java Básico

## 📝 Equilibrando o Saldo - Desafio


### Descrição

Uma nova feature para um sistema bancário foi analisada pela equipe de desenvolvimento e será uma das tarefas a serem trabalhadas durante a sprint, como desenvolvedor da empresa você recebeu os requisitos para a nova implementação que consiste em uma solução algorítmica que permita aos clientes realizarem saques em caixas eletrônicos. No entanto, existem algumas regras a serem seguidas para garantir que um saque possa ser realizado com sucesso.

**Regras do saque:**

- Cada cliente digitará o valor do seu saldoTotal de sua conta bancária e o valorSaque.
- Um saque só pode ser realizado se o saldoDisponível na conta for igual ou superior ao valor solicitado.
- Se o saldo for suficiente, o valor solicitado deve ser subtraído do saldo disponível, indicando que o saque foi realizado.
- Se o saldo for insuficiente, o saque não deve ser realizado e uma mensagem adequada deve ser exibida.

### Entrada

A entrada consiste em dois valores inteiros que representam o total do saldo da conta e o valor do saque.

### Saída

Se o saque for realizado com sucesso, exibir a mensagem "Saque realizado com sucesso! Novo saldo: {saldo}", onde {saldo} é o novo saldo disponível na conta.

Se o saque não for possível devido a saldo insuficiente, exibir a mensagem "Saldo insuficiente. Saque nao realizado!"

### Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

<table>
	<thead>
		<tr>
			<th>Entrada</th>
			<th>Saída</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>
			<p>&nbsp;1000<br>
			&nbsp;200</p>
			</td>
			<td>
			<p>Saque realizado com sucesso! Novo saldo: 800</p>
			</td>
		</tr>
		<tr>
			<td>
			<p>1500<br>
			1800</p>
			</td>
			<td>Saldo insuficiente. Saque nao realizado!</td>
		</tr>
		<tr>
			<td>300<br>
			200</td>
			<td>Saque realizado com sucesso. Novo saldo: 100</td>
		</tr>
	</tbody>
</table>