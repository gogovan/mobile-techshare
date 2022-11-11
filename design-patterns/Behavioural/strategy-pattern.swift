print("Strategy Pattern, is a Behavioural pattern > that allows the program to pick an algorithm at runtime!\n")

// - MARK: Compiletime Part

protocol PaymentServiceable {
    func setPaymetStrategy(paymentStrategy: PaymentStrategy)
    func getPaymetStrategy() -> PaymentStrategy?
    func pay()
}

class PaymentService: PaymentServiceable {
    private var paymentStrategy: PaymentStrategy?

    func setPaymetStrategy(paymentStrategy: PaymentStrategy) {
        self.paymentStrategy = paymentStrategy
    }

    func getPaymetStrategy() -> PaymentStrategy? {
        paymentStrategy
    }

    func pay() {
        paymentStrategy?.makePayment()
    }
}

protocol PaymentStrategy {
    func makePayment()
}

/// CardPaymentStrategy conforms to PaymentStrategy Protocol
class CardPaymentStrategy: PaymentStrategy {
    func makePayment() {
        print("\nSuccessfully made a card payment!")
    }
}

/// CashPaymentStrategy conforms to PaymentStrategy Protocol
class CashPaymentStrategy: PaymentStrategy {
    func makePayment() {
        print("\nSuccessfully made a cash payment!")
    }
}

/// BarterPaymentStrategy conforms to PaymentStrategy Protocol
class BarterPaymentStrategy: PaymentStrategy {
    func makePayment() {
        print("\nSuccessfully made a barter!")
    }
}


// - MARK: Runtime Part

// create a payment service with Cash Payment Strategy

let paymentService = PaymentService()
paymentService.setPaymetStrategy(paymentStrategy: CashPaymentStrategy())
paymentService.pay()

// set the payment service with Card Payment Strategy
paymentService.setPaymetStrategy(paymentStrategy: CardPaymentStrategy())
paymentService.pay()

// set the payment service with Barter Payment Strategy
paymentService.setPaymetStrategy(paymentStrategy: BarterPaymentStrategy())
paymentService.pay()
