# 💻 Bootcamp Santander - Trilha Java Intermediário

## 📝 A Última Transação - Desafio


### Descrição

<p>Neste desafio, você criará uma solução para um sistema bancário utilizando conceitos de orientação a objetos. A implementação solicitada pela equipe de desenvolvimento da empresa bancária, gostaria de fosse realizado uma melhoria no sistema de registros, onde é recebido os dados brutos dos registros bancários. O objetivo é obter as informações de uma forma mais amigável para o cliente e não oferecer informações brutas.</p>

<p>Considere que cada transação é representada por apenas uma string contendo as seguintes informações:</p>

<h5><code>data,</code><code>hora,</code><code>descricao,</code><code>valor</code></h5>

<p>Dessa forma, crie uma classe representando as <code>Transacoes</code> e nela será recebido os atributos necessários para guardar as informações, ao fim, retorne o registro contendo a data, hora e valor da transação.</p>

<h2>Entrada</h2>

<p>A entrada será a representação de um registro (string) no formato e sequência: "data,hora,descricao,valor".</p>

<h2>Saída</h2>

<p>A saída deve ser o valor do registro (string) recebido na entrada informando a transação efetuada, contendo, descrição, data, hora e valor da transação, como no exemplo da tabela abaixo.</p>

<h2>Exemplos</h2>

<p>A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.</p>

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
			<p>01/02/2023,09:00:00,Deposito,100.00</p>
			</td>
			<td>
			<p>Deposito<br>
			01/02/2023<br>
			09:00:00<br>
			100.00</p>
			</td>
		</tr>
		<tr>
			<td>
			<p>11/05/2023,11:15:00,Transferencia,25.00</p>
			</td>
			<td>Transferencia<br>
			11/05/2023<br>
			11:15:00<br>
			25.00</td>
		</tr>
		<tr>
			<td>
			<p><br>
			21/09/2023,10:30:00,Saque,30.00<br>
			&nbsp;</p>
			</td>
			<td>Saque<br>
			21/09/2023<br>
			10:30:00<br>
			30.00</td>
		</tr>
	</tbody>
</table> </div>
