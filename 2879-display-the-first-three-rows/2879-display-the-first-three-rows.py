import pandas as pd

def selectFirstRows(employees: pd.DataFrame) -> pd.DataFrame:
    
    print(employees)
    return employees.head(3)