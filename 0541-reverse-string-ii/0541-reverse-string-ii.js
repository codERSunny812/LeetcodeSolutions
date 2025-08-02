 var reverseStr = function (s, k) {
      s = s.split("")
  
      for (let x = 0; x < s.length; x = x + (2 * k)) {
          let n = Math.min(k, s.length - x)
          let mid = Math.floor(n / 2)
          for (let i = 0; i < mid; i++) {
              let temp = s[x + i]
              s[x + i] = s[x + n - 1 - i]
              s[x + n - 1 - i] = temp
          }
      }
      return s.join("")
  };    