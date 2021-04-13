public class TennisGame {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";

    public static String  getScore(String firstPlayer, String secondPlayer, int ScoreOfPlayer1, int ScoreOfPayer2) {
        String score = "";
        int tempScore=0;
        if (ScoreOfPlayer1==ScoreOfPayer2)
        {
            switch (ScoreOfPlayer1)
            {
                case 0:
                    score = LOVE_ALL;
                    break;
                case 1:
                    score = FIFTEEN_ALL;
                    break;
                case 2:
                    score = THIRTY_ALL;
                    break;
                case 3:
                    score = FORTY_ALL;
                    break;
                default:
                    score = DEUCE;
                    break;

            }
        }
        else if (ScoreOfPlayer1>=4 || ScoreOfPayer2>=4)
        {
            int Resuelt = ScoreOfPlayer1-ScoreOfPayer2;
            if (Resuelt==1) score = ADVANTAGE_PLAYER_1;
            else if (Resuelt ==-1) score = ADVANTAGE_PLAYER_2;
            else if (Resuelt>=2) score = WIN_FOR_PLAYER_1;
            else score = WIN_FOR_PLAYER_2;
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = ScoreOfPlayer1;
                else { score+="-"; tempScore = ScoreOfPayer2;}
                switch(tempScore)
                {
                    case 0:
                        score+= LOVE;
                        break;
                    case 1:
                        score+= FIFTEEN;
                        break;
                    case 2:
                        score+= THIRTY;
                        break;
                    case 3:
                        score+= FORTY;
                        break;
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {
        System.out.println(getScore("hoa","thoa",3,2));
    }
}
