package cn.iocoder.yudao.framework.ai.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 芋道 AI 配置类
 *
 * @author fansili
 * @since 1.0
 */
@ConfigurationProperties(prefix = "yudao.ai")
@Data
public class YudaoAiProperties {

    /**
     * DeepSeek
     */
    @SuppressWarnings("SpellCheckingInspection")
    private DeepSeekProperties deepseek;

    /**
     * 字节豆包
     */
    @SuppressWarnings("SpellCheckingInspection")
    private DouBaoProperties doubao;

    /**
     * 腾讯混元
     */
    @SuppressWarnings("SpellCheckingInspection")
    private HunYuanProperties hunyuan;

    /**
     * 讯飞星火
     */
    @SuppressWarnings("SpellCheckingInspection")
    private XingHuoProperties xinghuo;

    /**
     * Midjourney 绘图
     */
    private MidjourneyProperties midjourney;

    /**
     * Suno 音乐
     */
    @SuppressWarnings("SpellCheckingInspection")
    private SunoProperties suno;

    @Data
    public static class DeepSeekProperties {

        private String enable;
        private String apiKey;

        private String model;
        private Double temperature;
        private Integer maxTokens;
        private Double topP;

    }

    @Data
    public static class DouBaoProperties {

        private String enable;
        private String apiKey;

        private String model;
        private Double temperature;
        private Integer maxTokens;
        private Double topP;

    }

    @Data
    public static class HunYuanProperties {

        private String enable;
        private String baseUrl;
        private String apiKey;

        private String model;
        private Double temperature;
        private Integer maxTokens;
        private Double topP;

    }

    @Data
    public static class XingHuoProperties {

        private String enable;
        private String appId;
        private String appKey;
        private String secretKey;

        private String model;
        private Double temperature;
        private Integer maxTokens;
        private Double topP;

    }

    @Data
    public static class MidjourneyProperties {

        private String enable;
        private String baseUrl;

        private String apiKey;
        private String notifyUrl;

    }

    @Data
    public static class SunoProperties {

        private boolean enable = false;

        private String baseUrl;

    }

}
