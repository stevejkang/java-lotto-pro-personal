package lotto.constants;

public class LottoGameMessage {
    private LottoGameMessage() {}

    public static final String WAIT_FOR_USER_MONEY_INPUT = "구입금액을 입력해 주세요.";
    public static final String PURCHASED_LOTTO_COUNT_INFORMATION = "수동으로 %s장, 자동으로 %s개를 구매했습니다.";
    public static final String WAIT_FOR_MANUAL_LOTTO_PURCHASE_COUNT_INPUT = "수동으로 구매할 로또 수를 입력해 주세요.";
    public static final String WAIT_FOR_MANUAL_LOTTO_NUMBERS_INPUT = "수동으로 구매할 번호를 입력해 주세요.";
    public static final String WAIT_FOR_LATEST_LOTTO_RESULT_INPUT = "지난 주 당첨 번호를 입력해 주세요.";
    public static final String WAIT_FOR_BONUS_LOTTO_NUMBER_INPUT = "보너스 볼을 입력해 주세요.";
    public static final String LOTTO_STATISTICS_INFORMATION_TITLE = "당첨 통계";
    public static final String DIVIDER = "---------";
    public static final String STATISTICS_PER_NUMBER_OF_MATCH = "%s개 일치%s(%s원)- %s개";
    public static final String STATISTICS_PER_NUMBER_OF_MATCH_BONUS_MATCHED = ", 보너스 볼 일치";
    public static final String TOTAL_PROFIT_RESULT = "총 수익률은 %2.2f입니다.";
    public static final String TOTAL_PROFIT_DESCRIPTION = "(기준이 1이기 때문에 결과적으로는 %s라는 의미임)";

    public static final String HAS_PROFIT = "이득";
    public static final String HAS_LOSS = "손해";
    public static final String HAS_NOTHING = "무의미";
}
