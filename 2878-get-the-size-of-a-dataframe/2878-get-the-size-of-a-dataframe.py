import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:

    shp = players.shape
    

    (row,column) = shp


    return [row,column]
    