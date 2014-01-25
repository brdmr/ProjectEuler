
-- Not sure if i remember correct.
prob1000 = sum [x | x <- [0 .. 999], x `mod` 3 == 0 || x `mod` 5 == 0]

prob1000rec n 
        | n == 0 = 0
        | n `mod` 3 == 0 || n `mod` 5 == 0 = n + prob1000rec (n-1)
        | otherwise = prob1000rec(n-1)
