import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    
  df= animals.sort_values(by="weight",ascending=False)
  print(df[df["weight"]>100][["name"]])

  return  df[df["weight"]>100][["name"]]