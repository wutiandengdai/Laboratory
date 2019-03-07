<p>Description: <br>
    Count countries<br>
    Given a random 2 dimension matrix, if A[i][j]=A[i+-1]A[j] or A[i][j]=A[i]A[j+-1], the two value considered to be in the same country.<br>
</p>

<p>Test cases:<br>
    Given random matrix;<br>
    Given matrix of the same value,1 country ;<br>
    Given matrix of two country blocks;<br>
    Given empty matrix, 0 country<br>
</p>

<p>
Run:<br>
    cd count_countries<br>
    mvn clean install<br>
    mvn clean test<br>
</p>