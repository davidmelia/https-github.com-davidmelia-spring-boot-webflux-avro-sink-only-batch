import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description('should send an fx rate')

    label('triggerAvroFxRateEvent')
    input {
        triggeredBy('triggerAvroFxRateEvent()')
    }
    outputMessage {
        sentTo('fx-rates')
        body(
          
                [
                    
	                from: 'GBP',
	                to: 'USD',
	                rate: '1.23'
                    
                ]
            
        	
        )
    }
}

