const fs = require('fs');
const path = require('path');

class Product {
    constructor(name, price, stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}

class CustomerProducts {
    constructor(customer_id, product, count) {
        this.customer_id = customer_id;
        this.product = product;
        this.count = count;
    }
}

class Cafe {
    constructor(products, balance = 0) {
        this.products = products;
        this.balance = balance;
        this.customer_products = [];
    }

    buyProduct(customer_id, product, count) {
        let productToBuy = this.getProduct(product.name);
        if (!productToBuy || productToBuy.stock < count) {
            return false;
        }
        productToBuy.stock -= count;
        this.balance += productToBuy.price * count;
        this.customer_products.push(new CustomerProducts(customer_id, product, count));
        return true;
    }

    returnProduct(customer_id, product, count) {
        let customerProductInstance = this.customer_products.find(cp => customer_id === cp.customer_id && cp.product.name === product.name);
        if (!customerProductInstance || customerProductInstance.count < count) {
            return false;
        }
        product.stock += count;
        this.balance -= product.price * count;
        customerProductInstance.count -= count;
        if (customerProductInstance.count === 0) {
            this.customer_products = this.customer_products.filter(cp => !(cp.customer_id === customer_id && cp.product.name === product.name));
        }
        return true;
    }

    getCurrentBalance() {
        return this.balance;
    }

    getProduct(productName) {
        return this.products.find(product => product.name === productName);
    }
}

// Read test cases from a directory
function readTestCases(testDir) {
    const testCases = [];

    const folders = fs.readdirSync(testDir);
    folders.forEach(folder => {
        const inputFilePath = path.join(testDir, folder, 'input.txt');
        const outputFilePath = path.join(testDir, folder, 'output.txt');
        const input = fs.readFileSync(inputFilePath, 'utf-8').trim().split('\n');
        const expectedOutput = fs.readFileSync(outputFilePath, 'utf-8').trim().split('\n');

        testCases.push({ input, expectedOutput });
    });

    return testCases;
}

// Run the test cases
function runTests(testCases) {
    let passedTests = 0;

    testCases.forEach((testCase, index) => {
        const { input, expectedOutput } = testCase;
        const products = [
            new Product('Biscuit', 10, 30),
            new Product('Sandwich', 70, 40),
            new Product('Juice', 150, 10),
            new Product('Coffee', 80, 25),
            new Product('Cake', 120, 50)
        ];
        const cafe = new Cafe(products, 2000);

        const actualOutput = [];

        for (let i = 0; i < input.length; i += 4) {
            const action = input[i];
            const customer_id = parseInt(input[i + 1], 10);
            const product = products.find(p => p.name === input[i + 2]);
            const count = parseInt(input[i + 3], 10);

            if (action === 'buyProduct') {
                const result = cafe.buyProduct(customer_id, product, count);
                actualOutput.push(result ? 'true' : 'false');
                actualOutput.push(cafe.getCurrentBalance().toString());
            } else if (action === 'returnProduct') {
                const result = cafe.returnProduct(customer_id, product, count);
                actualOutput.push(result ? 'true' : 'false');
                actualOutput.push(cafe.getCurrentBalance().toString());
            }
        }

        console.log(`Test Case ${index + 1}:`);
        console.log(`Expected Output: ${expectedOutput.join('\n')}`);
        console.log(`Actual Output: ${actualOutput.join('\n')}`);

        if (expectedOutput.join('\n') === actualOutput.join('\n')) {
            console.log('Result: Passed\n');
            passedTests++;
        } else {
            console.log('Result: Failed\n');
        }
    });

    console.log(`Passed ${passedTests} out of ${testCases.length} tests.`);
}

// Load and run test cases from both public and private folders
const publicTestCases = readTestCases('IITMBS/MAD2/Week2/CafeManagement/testcase/public');
const privateTestCases = readTestCases('IITMBS/MAD2/Week2/CafeManagement/testcase/private');

console.log('Public Test Cases:');
runTests(publicTestCases);

console.log('Private Test Cases:');
runTests(privateTestCases);
