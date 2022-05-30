import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description('should send a fx rate event on a scheduled event')

    label('triggerFxRateEventOnScheduledEvent')
    input {
        triggeredBy('triggerFxRateEventOnScheduledEvent()')
    }
    outputMessage {
        sentTo('test')
        body([
                "fxRates": [
                        [
                                "from": "NOK",
                                "to": "CHF",
                                "rate": 0.116967
                        ],
                        [
                                "from": "CHF",
                                "to": "AUD",
                                "rate": 1.399165
                        ],
                        [
                                "from": "AUD",
                                "to": "THB",
                                "rate": 24.120215
                        ],
                        [
                                "from": "SEK",
                                "to": "SGD",
                                "rate": 0.156656
                        ],
                        [
                                "from": "ILS",
                                "to": "SGD",
                                "rate": 0.418342
                        ],
                        [
                                "from": "CAD",
                                "to": "USD",
                                "rate": 0.797581
                        ],
                        [
                                "from": "JPY",
                                "to": "ILS",
                                "rate": 0.029175
                        ],
                        [
                                "from": "THB",
                                "to": "SGD",
                                "rate": 0.041375
                        ],
                        [
                                "from": "DKK",
                                "to": "USD",
                                "rate": 0.159647
                        ],
                        [
                                "from": "HKD",
                                "to": "THB",
                                "rate": 4.17364
                        ],
                        [
                                "from": "NOK",
                                "to": "SGD",
                                "rate": 0.155313
                        ],
                        [
                                "from": "AUD",
                                "to": "SEK",
                                "rate": 6.369548
                        ],
                        [
                                "from": "USD",
                                "to": "GBP",
                                "rate": 0.722569
                        ],
                        [
                                "from": "EUR",
                                "to": "USD",
                                "rate": 1.188149
                        ],
                        [
                                "from": "PLN",
                                "to": "JPY",
                                "rate": 28.932674
                        ],
                        [
                                "from": "ILS",
                                "to": "CHF",
                                "rate": 0.284823
                        ],
                        [
                                "from": "THB",
                                "to": "CHF",
                                "rate": 0.02817
                        ],
                        [
                                "from": "DKK",
                                "to": "ILS",
                                "rate": 0.512095
                        ],
                        [
                                "from": "NZD",
                                "to": "CLP",
                                "rate": 577.700751
                        ],
                        [
                                "from": "CAD",
                                "to": "ILS",
                                "rate": 2.558769
                        ],
                        [
                                "from": "SGD",
                                "to": "NZD",
                                "rate": 1.046436
                        ],
                        [
                                "from": "CHF",
                                "to": "SGD",
                                "rate": 1.468778
                        ],
                        [
                                "from": "JPY",
                                "to": "CAD",
                                "rate": 0.011402
                        ],
                        [
                                "from": "SEK",
                                "to": "AUD",
                                "rate": 0.157014
                        ],
                        [
                                "from": "NOK",
                                "to": "DKK",
                                "rate": 0.72498
                        ],
                        [
                                "from": "EUR",
                                "to": "HKD",
                                "rate": 9.233525
                        ],
                        [
                                "from": "PLN",
                                "to": "ZAR",
                                "rate": 3.785054
                        ],
                        [
                                "from": "SGD",
                                "to": "ZAR",
                                "rate": 10.718458
                        ],
                        [
                                "from": "NOK",
                                "to": "AUD",
                                "rate": 0.155629
                        ],
                        [
                                "from": "DKK",
                                "to": "HKD",
                                "rate": 1.24059
                        ],
                        [
                                "from": "GBP",
                                "to": "JPY",
                                "rate": 152.160682
                        ],
                        [
                                "from": "PLN",
                                "to": "NZD",
                                "rate": 0.36953
                        ],
                        [
                                "from": "GBP",
                                "to": "PLN",
                                "rate": 5.259006
                        ],
                        [
                                "from": "HKD",
                                "to": "SGD",
                                "rate": 0.172687
                        ],
                        [
                                "from": "CAD",
                                "to": "HKD",
                                "rate": 6.198552
                        ],
                        [
                                "from": "DKK",
                                "to": "EUR",
                                "rate": 0.134372
                        ],
                        [
                                "from": "CAD",
                                "to": "EUR",
                                "rate": 0.671384
                        ],
                        [
                                "from": "ZAR",
                                "to": "USD",
                                "rate": 0.069526
                        ],
                        [
                                "from": "JPY",
                                "to": "EUR",
                                "rate": 0.007656
                        ],
                        [
                                "from": "USD",
                                "to": "NOK",
                                "rate": 8.639981
                        ],
                        [
                                "from": "SEK",
                                "to": "CHF",
                                "rate": 0.106669
                        ],
                        [
                                "from": "JPY",
                                "to": "HKD",
                                "rate": 0.07068
                        ],
                        [
                                "from": "EUR",
                                "to": "ILS",
                                "rate": 3.811034
                        ],
                        [
                                "from": "SEK",
                                "to": "NOK",
                                "rate": 1.008814
                        ],
                        [
                                "from": "NZD",
                                "to": "USD",
                                "rate": 0.712143
                        ],
                        [
                                "from": "CHF",
                                "to": "THB",
                                "rate": 35.498758
                        ],
                        [
                                "from": "GBP",
                                "to": "EUR",
                                "rate": 1.164893
                        ],
                        [
                                "from": "GBP",
                                "to": "HKD",
                                "rate": 10.754423
                        ],
                        [
                                "from": "PLN",
                                "to": "CAD",
                                "rate": 0.329895
                        ],
                        [
                                "from": "THB",
                                "to": "SEK",
                                "rate": 0.264071
                        ],
                        [
                                "from": "PLN",
                                "to": "EUR",
                                "rate": 0.221495
                        ],
                        [
                                "from": "AUD",
                                "to": "CHF",
                                "rate": 0.679472
                        ],
                        [
                                "from": "ILS",
                                "to": "SEK",
                                "rate": 2.670006
                        ],
                        [
                                "from": "HKD",
                                "to": "AUD",
                                "rate": 0.173053
                        ],
                        [
                                "from": "ZAR",
                                "to": "CLP",
                                "rate": 56.392037
                        ],
                        [
                                "from": "EUR",
                                "to": "CAD",
                                "rate": 1.489279
                        ],
                        [
                                "from": "CLP",
                                "to": "USD",
                                "rate": 0.001233
                        ],
                        [
                                "from": "AUD",
                                "to": "SGD",
                                "rate": 0.998075
                        ],
                        [
                                "from": "PLN",
                                "to": "HKD",
                                "rate": 2.044956
                        ],
                        [
                                "from": "ILS",
                                "to": "THB",
                                "rate": 10.110917
                        ],
                        [
                                "from": "SEK",
                                "to": "DKK",
                                "rate": 0.731369
                        ],
                        [
                                "from": "USD",
                                "to": "CLP",
                                "rate": 811.030008
                        ],
                        [
                                "from": "HKD",
                                "to": "CHF",
                                "rate": 0.117571
                        ],
                        [
                                "from": "GBP",
                                "to": "CAD",
                                "rate": 1.734858
                        ],
                        [
                                "from": "EUR",
                                "to": "PLN",
                                "rate": 4.514775
                        ],
                        [
                                "from": "EUR",
                                "to": "JPY",
                                "rate": 130.61651
                        ],
                        [
                                "from": "SGD",
                                "to": "SEK",
                                "rate": 6.382598
                        ],
                        [
                                "from": "CAD",
                                "to": "PLN",
                                "rate": 3.031268
                        ],
                        [
                                "from": "JPY",
                                "to": "USD",
                                "rate": 0.009096
                        ],
                        [
                                "from": "CAD",
                                "to": "JPY",
                                "rate": 87.703912
                        ],
                        [
                                "from": "SEK",
                                "to": "GBP",
                                "rate": 0.084368
                        ],
                        [
                                "from": "GBP",
                                "to": "ILS",
                                "rate": 4.439255
                        ],
                        [
                                "from": "HKD",
                                "to": "NOK",
                                "rate": 1.11185
                        ],
                        [
                                "from": "SGD",
                                "to": "THB",
                                "rate": 24.169184
                        ],
                        [
                                "from": "CHF",
                                "to": "SEK",
                                "rate": 9.374795
                        ],
                        [
                                "from": "NOK",
                                "to": "GBP",
                                "rate": 0.083631
                        ],
                        [
                                "from": "HKD",
                                "to": "DKK",
                                "rate": 0.806069
                        ],
                        [
                                "from": "NZD",
                                "to": "CAD",
                                "rate": 0.892742
                        ],
                        [
                                "from": "CLP",
                                "to": "AUD",
                                "rate": 0.001658
                        ],
                        [
                                "from": "JPY",
                                "to": "CLP",
                                "rate": 7.377297
                        ],
                        [
                                "from": "PLN",
                                "to": "USD",
                                "rate": 0.263158
                        ],
                        [
                                "from": "NZD",
                                "to": "EUR",
                                "rate": 0.599396
                        ],
                        [
                                "from": "NZD",
                                "to": "HKD",
                                "rate": 5.533942
                        ],
                        [
                                "from": "HKD",
                                "to": "GBP",
                                "rate": 0.092985
                        ],
                        [
                                "from": "SGD",
                                "to": "ILS",
                                "rate": 2.390389
                        ],
                        [
                                "from": "CHF",
                                "to": "CLP",
                                "rate": 888.099467
                        ],
                        [
                                "from": "SEK",
                                "to": "NZD",
                                "rate": 0.163957
                        ],
                        [
                                "from": "ILS",
                                "to": "NZD",
                                "rate": 0.437768
                        ],
                        [
                                "from": "CLP",
                                "to": "DKK",
                                "rate": 0.007723
                        ],
                        [
                                "from": "USD",
                                "to": "THB",
                                "rate": 32.432783
                        ],
                        [
                                "from": "THB",
                                "to": "CLP",
                                "rate": 25.008753
                        ],
                        [
                                "from": "SGD",
                                "to": "EUR",
                                "rate": 0.62723
                        ],
                        [
                                "from": "NOK",
                                "to": "NZD",
                                "rate": 0.162525
                        ],
                        [
                                "from": "DKK",
                                "to": "NZD",
                                "rate": 0.224179
                        ],
                        [
                                "from": "CAD",
                                "to": "NZD",
                                "rate": 1.120146
                        ],
                        [
                                "from": "SGD",
                                "to": "HKD",
                                "rate": 5.791092
                        ],
                        [
                                "from": "SGD",
                                "to": "CAD",
                                "rate": 0.934197
                        ],
                        [
                                "from": "ILS",
                                "to": "ZAR",
                                "rate": 4.484003
                        ],
                        [
                                "from": "GBP",
                                "to": "USD",
                                "rate": 1.383949
                        ],
                        [
                                "from": "SEK",
                                "to": "ZAR",
                                "rate": 1.679396
                        ],
                        [
                                "from": "CLP",
                                "to": "SGD",
                                "rate": 0.001654
                        ],
                        [
                                "from": "ILS",
                                "to": "JPY",
                                "rate": 34.275921
                        ],
                        [
                                "from": "ILS",
                                "to": "PLN",
                                "rate": 1.18466
                        ],
                        [
                                "from": "ZAR",
                                "to": "JPY",
                                "rate": 7.643916
                        ],
                        [
                                "from": "AUD",
                                "to": "HKD",
                                "rate": 5.77861
                        ],
                        [
                                "from": "ZAR",
                                "to": "PLN",
                                "rate": 0.264197
                        ],
                        [
                                "from": "PLN",
                                "to": "ILS",
                                "rate": 0.844124
                        ],
                        [
                                "from": "AUD",
                                "to": "EUR",
                                "rate": 0.625942
                        ],
                        [
                                "from": "DKK",
                                "to": "ZAR",
                                "rate": 2.296232
                        ],
                        [
                                "from": "THB",
                                "to": "GBP",
                                "rate": 0.022279
                        ],
                        [
                                "from": "CAD",
                                "to": "ZAR",
                                "rate": 11.473548
                        ],
                        [
                                "from": "USD",
                                "to": "SEK",
                                "rate": 8.56509
                        ],
                        [
                                "from": "AUD",
                                "to": "CAD",
                                "rate": 0.932277
                        ],
                        [
                                "from": "CLP",
                                "to": "CHF",
                                "rate": 0.001126
                        ],
                        [
                                "from": "NZD",
                                "to": "ILS",
                                "rate": 2.284315
                        ],
                        [
                                "from": "EUR",
                                "to": "CLP",
                                "rate": 963.391137
                        ],
                        [
                                "from": "NOK",
                                "to": "ZAR",
                                "rate": 1.664724
                        ],
                        [
                                "from": "AUD",
                                "to": "ILS",
                                "rate": 2.385542
                        ],
                        [
                                "from": "AUD",
                                "to": "ZAR",
                                "rate": 10.696789
                        ],
                        [
                                "from": "USD",
                                "to": "DKK",
                                "rate": 6.26382
                        ],
                        [
                                "from": "CLP",
                                "to": "GBP",
                                "rate": 0.000891
                        ],
                        [
                                "from": "SGD",
                                "to": "PLN",
                                "rate": 2.831794
                        ],
                        [
                                "from": "SGD",
                                "to": "JPY",
                                "rate": 81.933634
                        ],
                        [
                                "from": "DKK",
                                "to": "CAD",
                                "rate": 0.200134
                        ],
                        [
                                "from": "AUD",
                                "to": "NZD",
                                "rate": 1.044313
                        ],
                        [
                                "from": "USD",
                                "to": "AUD",
                                "rate": 1.344719
                        ],
                        [
                                "from": "CHF",
                                "to": "GBP",
                                "rate": 0.790888
                        ],
                        [
                                "from": "NOK",
                                "to": "SEK",
                                "rate": 0.991263
                        ],
                        [
                                "from": "CAD",
                                "to": "SEK",
                                "rate": 6.831861
                        ],
                        [
                                "from": "HKD",
                                "to": "CLP",
                                "rate": 104.373239
                        ],
                        [
                                "from": "CAD",
                                "to": "THB",
                                "rate": 25.871213
                        ],
                        [
                                "from": "DKK",
                                "to": "JPY",
                                "rate": 17.552174
                        ],
                        [
                                "from": "DKK",
                                "to": "PLN",
                                "rate": 0.606658
                        ],
                        [
                                "from": "SEK",
                                "to": "THB",
                                "rate": 3.78686
                        ],
                        [
                                "from": "CHF",
                                "to": "NOK",
                                "rate": 9.456891
                        ],
                        [
                                "from": "USD",
                                "to": "CHF",
                                "rate": 0.913651
                        ],
                        [
                                "from": "CLP",
                                "to": "NOK",
                                "rate": 0.010652
                        ],
                        [
                                "from": "ZAR",
                                "to": "ILS",
                                "rate": 0.223015
                        ],
                        [
                                "from": "THB",
                                "to": "AUD",
                                "rate": 0.041459
                        ],
                        [
                                "from": "CHF",
                                "to": "DKK",
                                "rate": 6.85603
                        ],
                        [
                                "from": "THB",
                                "to": "NOK",
                                "rate": 0.266399
                        ],
                        [
                                "from": "ILS",
                                "to": "CAD",
                                "rate": 0.390813
                        ],
                        [
                                "from": "NOK",
                                "to": "THB",
                                "rate": 3.753768
                        ],
                        [
                                "from": "NZD",
                                "to": "PLN",
                                "rate": 2.70614
                        ],
                        [
                                "from": "JPY",
                                "to": "GBP",
                                "rate": 0.006572
                        ],
                        [
                                "from": "ZAR",
                                "to": "CAD",
                                "rate": 0.087157
                        ],
                        [
                                "from": "ILS",
                                "to": "EUR",
                                "rate": 0.262396
                        ],
                        [
                                "from": "NZD",
                                "to": "JPY",
                                "rate": 78.296273
                        ],
                        [
                                "from": "ILS",
                                "to": "HKD",
                                "rate": 2.422575
                        ],
                        [
                                "from": "USD",
                                "to": "SGD",
                                "rate": 1.341949
                        ],
                        [
                                "from": "ZAR",
                                "to": "HKD",
                                "rate": 0.540271
                        ],
                        [
                                "from": "ZAR",
                                "to": "EUR",
                                "rate": 0.058518
                        ],
                        [
                                "from": "AUD",
                                "to": "PLN",
                                "rate": 2.826056
                        ],
                        [
                                "from": "THB",
                                "to": "DKK",
                                "rate": 0.193134
                        ],
                        [
                                "from": "AUD",
                                "to": "JPY",
                                "rate": 81.766149
                        ],
                        [
                                "from": "GBP",
                                "to": "CLP",
                                "rate": 1122.334456
                        ],
                        [
                                "from": "ZAR",
                                "to": "SEK",
                                "rate": 0.595452
                        ],
                        [
                                "from": "DKK",
                                "to": "SGD",
                                "rate": 0.214231
                        ],
                        [
                                "from": "CAD",
                                "to": "SGD",
                                "rate": 1.070435
                        ],
                        [
                                "from": "CHF",
                                "to": "ILS",
                                "rate": 3.510952
                        ],
                        [
                                "from": "JPY",
                                "to": "AUD",
                                "rate": 0.01223
                        ],
                        [
                                "from": "EUR",
                                "to": "CHF",
                                "rate": 1.085637
                        ],
                        [
                                "from": "CLP",
                                "to": "ZAR",
                                "rate": 0.017733
                        ],
                        [
                                "from": "USD",
                                "to": "JPY",
                                "rate": 109.938434
                        ],
                        [
                                "from": "DKK",
                                "to": "CHF",
                                "rate": 0.145857
                        ],
                        [
                                "from": "USD",
                                "to": "PLN",
                                "rate": 3.799998
                        ],
                        [
                                "from": "CAD",
                                "to": "CHF",
                                "rate": 0.72886
                        ],
                        [
                                "from": "PLN",
                                "to": "GBP",
                                "rate": 0.19015
                        ],
                        [
                                "from": "JPY",
                                "to": "CHF",
                                "rate": 0.00831
                        ],
                        [
                                "from": "EUR",
                                "to": "SGD",
                                "rate": 1.594235
                        ],
                        [
                                "from": "SEK",
                                "to": "USD",
                                "rate": 0.116755
                        ],
                        [
                                "from": "JPY",
                                "to": "NOK",
                                "rate": 0.078585
                        ],
                        [
                                "from": "NOK",
                                "to": "HKD",
                                "rate": 0.899402
                        ],
                        [
                                "from": "DKK",
                                "to": "AUD",
                                "rate": 0.214666
                        ],
                        [
                                "from": "CAD",
                                "to": "AUD",
                                "rate": 1.072929
                        ],
                        [
                                "from": "PLN",
                                "to": "CLP",
                                "rate": 213.447172
                        ],
                        [
                                "from": "SEK",
                                "to": "ILS",
                                "rate": 0.374531
                        ],
                        [
                                "from": "JPY",
                                "to": "DKK",
                                "rate": 0.056973
                        ],
                        [
                                "from": "CHF",
                                "to": "USD",
                                "rate": 1.094511
                        ],
                        [
                                "from": "NOK",
                                "to": "CAD",
                                "rate": 0.145093
                        ],
                        [
                                "from": "ZAR",
                                "to": "THB",
                                "rate": 2.254893
                        ],
                        [
                                "from": "NOK",
                                "to": "EUR",
                                "rate": 0.097417
                        ],
                        [
                                "from": "NOK",
                                "to": "ILS",
                                "rate": 0.371259
                        ],
                        [
                                "from": "ILS",
                                "to": "USD",
                                "rate": 0.311753
                        ],
                        [
                                "from": "THB",
                                "to": "USD",
                                "rate": 0.030833
                        ],
                        [
                                "from": "CAD",
                                "to": "DKK",
                                "rate": 4.996652
                        ],
                        [
                                "from": "CLP",
                                "to": "NZD",
                                "rate": 0.001731
                        ],
                        [
                                "from": "HKD",
                                "to": "USD",
                                "rate": 0.128687
                        ],
                        [
                                "from": "EUR",
                                "to": "AUD",
                                "rate": 1.597835
                        ],
                        [
                                "from": "USD",
                                "to": "CAD",
                                "rate": 1.253601
                        ],
                        [
                                "from": "SGD",
                                "to": "CLP",
                                "rate": 604.594921
                        ],
                        [
                                "from": "NZD",
                                "to": "ZAR",
                                "rate": 10.242858
                        ],
                        [
                                "from": "GBP",
                                "to": "DKK",
                                "rate": 8.668817
                        ],
                        [
                                "from": "ZAR",
                                "to": "NZD",
                                "rate": 0.097629
                        ],
                        [
                                "from": "PLN",
                                "to": "DKK",
                                "rate": 1.648375
                        ],
                        [
                                "from": "CAD",
                                "to": "NOK",
                                "rate": 6.892131
                        ],
                        [
                                "from": "JPY",
                                "to": "THB",
                                "rate": 0.294991
                        ],
                        [
                                "from": "CLP",
                                "to": "THB",
                                "rate": 0.039986
                        ],
                        [
                                "from": "PLN",
                                "to": "NOK",
                                "rate": 2.273683
                        ],
                        [
                                "from": "EUR",
                                "to": "DKK",
                                "rate": 7.442027
                        ],
                        [
                                "from": "JPY",
                                "to": "SEK",
                                "rate": 0.077899
                        ],
                        [
                                "from": "HKD",
                                "to": "ILS",
                                "rate": 0.412784
                        ],
                        [
                                "from": "NZD",
                                "to": "SGD",
                                "rate": 0.955626
                        ],
                        [
                                "from": "USD",
                                "to": "ZAR",
                                "rate": 14.383108
                        ],
                        [
                                "from": "SEK",
                                "to": "EUR",
                                "rate": 0.098264
                        ],
                        [
                                "from": "DKK",
                                "to": "SEK",
                                "rate": 1.367299
                        ],
                        [
                                "from": "SEK",
                                "to": "HKD",
                                "rate": 0.907259
                        ],
                        [
                                "from": "GBP",
                                "to": "NOK",
                                "rate": 11.957289
                        ],
                        [
                                "from": "EUR",
                                "to": "NOK",
                                "rate": 10.265149
                        ],
                        [
                                "from": "SGD",
                                "to": "USD",
                                "rate": 0.745212
                        ],
                        [
                                "from": "SEK",
                                "to": "CAD",
                                "rate": 0.146366
                        ],
                        [
                                "from": "EUR",
                                "to": "GBP",
                                "rate": 0.858486
                        ],
                        [
                                "from": "GBP",
                                "to": "CHF",
                                "rate": 1.264446
                        ],
                        [
                                "from": "CAD",
                                "to": "GBP",
                                "rate": 0.576396
                        ],
                        [
                                "from": "DKK",
                                "to": "THB",
                                "rate": 5.177752
                        ],
                        [
                                "from": "SEK",
                                "to": "PLN",
                                "rate": 0.443691
                        ],
                        [
                                "from": "JPY",
                                "to": "SGD",
                                "rate": 0.012205
                        ],
                        [
                                "from": "SEK",
                                "to": "JPY",
                                "rate": 12.837135
                        ],
                        [
                                "from": "USD",
                                "to": "NZD",
                                "rate": 1.404212
                        ],
                        [
                                "from": "AUD",
                                "to": "USD",
                                "rate": 0.74375
                        ],
                        [
                                "from": "NZD",
                                "to": "SEK",
                                "rate": 6.09916
                        ],
                        [
                                "from": "GBP",
                                "to": "AUD",
                                "rate": 1.861081
                        ],
                        [
                                "from": "HKD",
                                "to": "CAD",
                                "rate": 0.161333
                        ],
                        [
                                "from": "NZD",
                                "to": "THB",
                                "rate": 23.096822
                        ],
                        [
                                "from": "CLP",
                                "to": "SEK",
                                "rate": 0.010559
                        ],
                        [
                                "from": "HKD",
                                "to": "EUR",
                                "rate": 0.108317
                        ],
                        [
                                "from": "NOK",
                                "to": "PLN",
                                "rate": 0.439815
                        ],
                        [
                                "from": "NOK",
                                "to": "JPY",
                                "rate": 12.725075
                        ],
                        [
                                "from": "CLP",
                                "to": "ILS",
                                "rate": 0.003955
                        ],
                        [
                                "from": "NZD",
                                "to": "DKK",
                                "rate": 4.460721
                        ],
                        [
                                "from": "EUR",
                                "to": "NZD",
                                "rate": 1.668346
                        ],
                        [
                                "from": "CHF",
                                "to": "ZAR",
                                "rate": 15.743073
                        ],
                        [
                                "from": "THB",
                                "to": "NZD",
                                "rate": 0.043296
                        ],
                        [
                                "from": "PLN",
                                "to": "SGD",
                                "rate": 0.353133
                        ],
                        [
                                "from": "SGD",
                                "to": "AUD",
                                "rate": 1.002166
                        ],
                        [
                                "from": "NOK",
                                "to": "CLP",
                                "rate": 93.879084
                        ],
                        [
                                "from": "HKD",
                                "to": "PLN",
                                "rate": 0.489008
                        ],
                        [
                                "from": "HKD",
                                "to": "JPY",
                                "rate": 14.148274
                        ],
                        [
                                "from": "JPY",
                                "to": "ZAR",
                                "rate": 0.130823
                        ],
                        [
                                "from": "SGD",
                                "to": "NOK",
                                "rate": 6.438611
                        ],
                        [
                                "from": "THB",
                                "to": "ZAR",
                                "rate": 0.44348
                        ],
                        [
                                "from": "ILS",
                                "to": "CLP",
                                "rate": 252.844501
                        ],
                        [
                                "from": "JPY",
                                "to": "NZD",
                                "rate": 0.012772
                        ],
                        [
                                "from": "CLP",
                                "to": "EUR",
                                "rate": 0.001038
                        ],
                        [
                                "from": "CLP",
                                "to": "HKD",
                                "rate": 0.009581
                        ],
                        [
                                "from": "GBP",
                                "to": "SGD",
                                "rate": 1.857124
                        ],
                        [
                                "from": "CLP",
                                "to": "CAD",
                                "rate": 0.001546
                        ],
                        [
                                "from": "NZD",
                                "to": "NOK",
                                "rate": 6.1529
                        ],
                        [
                                "from": "SGD",
                                "to": "DKK",
                                "rate": 4.667859
                        ],
                        [
                                "from": "AUD",
                                "to": "NOK",
                                "rate": 6.425538
                        ],
                        [
                                "from": "ILS",
                                "to": "GBP",
                                "rate": 0.225263
                        ],
                        [
                                "from": "ZAR",
                                "to": "GBP",
                                "rate": 0.050237
                        ],
                        [
                                "from": "NZD",
                                "to": "CHF",
                                "rate": 0.650626
                        ],
                        [
                                "from": "THB",
                                "to": "PLN",
                                "rate": 0.117166
                        ],
                        [
                                "from": "CAD",
                                "to": "CLP",
                                "rate": 646.83053
                        ],
                        [
                                "from": "THB",
                                "to": "JPY",
                                "rate": 3.389934
                        ],
                        [
                                "from": "PLN",
                                "to": "AUD",
                                "rate": 0.35385
                        ],
                        [
                                "from": "HKD",
                                "to": "NZD",
                                "rate": 0.180703
                        ],
                        [
                                "from": "GBP",
                                "to": "SEK",
                                "rate": 11.853257
                        ],
                        [
                                "from": "AUD",
                                "to": "DKK",
                                "rate": 4.6584
                        ],
                        [
                                "from": "DKK",
                                "to": "CLP",
                                "rate": 129.483361
                        ],
                        [
                                "from": "GBP",
                                "to": "THB",
                                "rate": 44.885318
                        ],
                        [
                                "from": "NZD",
                                "to": "AUD",
                                "rate": 0.957566
                        ],
                        [
                                "from": "PLN",
                                "to": "CHF",
                                "rate": 0.240426
                        ],
                        [
                                "from": "EUR",
                                "to": "ZAR",
                                "rate": 17.088759
                        ],
                        [
                                "from": "SGD",
                                "to": "CHF",
                                "rate": 0.680863
                        ],
                        [
                                "from": "CHF",
                                "to": "NZD",
                                "rate": 1.536981
                        ],
                        [
                                "from": "SEK",
                                "to": "CLP",
                                "rate": 94.705938
                        ],
                        [
                                "from": "USD",
                                "to": "EUR",
                                "rate": 0.841685
                        ],
                        [
                                "from": "CLP",
                                "to": "PLN",
                                "rate": 0.004685
                        ],
                        [
                                "from": "EUR",
                                "to": "SEK",
                                "rate": 10.176667
                        ],
                        [
                                "from": "CLP",
                                "to": "JPY",
                                "rate": 0.135551
                        ],
                        [
                                "from": "USD",
                                "to": "HKD",
                                "rate": 7.771095
                        ],
                        [
                                "from": "JPY",
                                "to": "PLN",
                                "rate": 0.034563
                        ],
                        [
                                "from": "DKK",
                                "to": "NOK",
                                "rate": 1.379348
                        ],
                        [
                                "from": "ZAR",
                                "to": "SGD",
                                "rate": 0.093297
                        ],
                        [
                                "from": "SGD",
                                "to": "GBP",
                                "rate": 0.538467
                        ],
                        [
                                "from": "AUD",
                                "to": "CLP",
                                "rate": 603.136309
                        ],
                        [
                                "from": "HKD",
                                "to": "ZAR",
                                "rate": 1.850923
                        ],
                        [
                                "from": "USD",
                                "to": "ILS",
                                "rate": 3.207668
                        ],
                        [
                                "from": "ZAR",
                                "to": "CHF",
                                "rate": 0.06352
                        ],
                        [
                                "from": "CHF",
                                "to": "PLN",
                                "rate": 4.159284
                        ],
                        [
                                "from": "CHF",
                                "to": "JPY",
                                "rate": 120.336943
                        ],
                        [
                                "from": "HKD",
                                "to": "SEK",
                                "rate": 1.102175
                        ],
                        [
                                "from": "ILS",
                                "to": "AUD",
                                "rate": 0.419192
                        ],
                        [
                                "from": "CHF",
                                "to": "CAD",
                                "rate": 1.371851
                        ],
                        [
                                "from": "NOK",
                                "to": "USD",
                                "rate": 0.115741
                        ],
                        [
                                "from": "ZAR",
                                "to": "AUD",
                                "rate": 0.093486
                        ],
                        [
                                "from": "PLN",
                                "to": "THB",
                                "rate": 8.534899
                        ],
                        [
                                "from": "GBP",
                                "to": "NZD",
                                "rate": 1.943359
                        ],
                        [
                                "from": "CHF",
                                "to": "HKD",
                                "rate": 8.505571
                        ],
                        [
                                "from": "CHF",
                                "to": "EUR",
                                "rate": 0.921228
                        ],
                        [
                                "from": "THB",
                                "to": "ILS",
                                "rate": 0.098903
                        ],
                        [
                                "from": "PLN",
                                "to": "SEK",
                                "rate": 2.253821
                        ],
                        [
                                "from": "ZAR",
                                "to": "NOK",
                                "rate": 0.6007
                        ],
                        [
                                "from": "ILS",
                                "to": "DKK",
                                "rate": 1.952763
                        ],
                        [
                                "from": "NZD",
                                "to": "GBP",
                                "rate": 0.514573
                        ],
                        [
                                "from": "THB",
                                "to": "CAD",
                                "rate": 0.038653
                        ],
                        [
                                "from": "ZAR",
                                "to": "DKK",
                                "rate": 0.435495
                        ],
                        [
                                "from": "THB",
                                "to": "EUR",
                                "rate": 0.025952
                        ],
                        [
                                "from": "GBP",
                                "to": "ZAR",
                                "rate": 19.905647
                        ],
                        [
                                "from": "DKK",
                                "to": "GBP",
                                "rate": 0.115356
                        ],
                        [
                                "from": "AUD",
                                "to": "GBP",
                                "rate": 0.537375
                        ],
                        [
                                "from": "ILS",
                                "to": "NOK",
                                "rate": 2.693537
                        ],
                        [
                                "from": "EUR",
                                "to": "THB",
                                "rate": 38.532676
                        ],
                        [
                                "from": "THB",
                                "to": "HKD",
                                "rate": 0.239599
                        ]
                ]
        ])
		headers {
			header('kafka_messageKey', 'FxRates')
		}        
    }
}