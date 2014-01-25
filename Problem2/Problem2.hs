problem2 :: Integer -> Integer
problem2 n = sum [x | x <- getFib [] n, x `mod` 2 == 0]

getFib :: [Integer] -> Integer -> [Integer]
getFib [] b = getFib [1,2] b
getFib a b 
    | last a < b = getFib (a ++ [ last a + last ( init a ) ] ) b
    | otherwise  = a
test n s
  | last s < n  = last s 
