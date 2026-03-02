function analyzeNumber() {
    const number = document.getElementById("numberInput").value;

    fetch(`/api/analyze/${number}`)
        .then(response => response.json())
        .then(data => {
            document.getElementById("result").innerHTML = `
                <p>Prime: ${data.isPrime}</p>
                <p>Factorial: ${data.factorial}</p>
                <p>Armstrong: ${data.isArmstrong}</p>
                <p>Fibonacci: ${data.fibonacci}</p>
            `;
        });
}
