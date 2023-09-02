package com.alipay.sofa.serverless.arklet.core.health;

import com.alipay.sofa.serverless.arklet.core.ArkletComponent;
import com.alipay.sofa.serverless.arklet.core.health.indicator.ArkletBaseIndicator;
import com.alipay.sofa.serverless.arklet.core.health.model.Health;
import com.alipay.sofa.serverless.arklet.core.command.builtin.model.BizModel;
import com.alipay.sofa.serverless.arklet.core.command.builtin.model.PluginModel;

/**
 * @author Lunarscave
 */
public interface HealthService extends ArkletComponent {

    Health getHealth();

    Health getHealth(String indicatorId);

    Health getHealth(String[] indicatorIds);

    Health queryModuleInfo();

    Health queryModuleInfo(String type, String name, String version);

    Health queryModuleInfo(BizModel bizModel);

    Health queryModuleInfo(PluginModel pluginModel);

    Health queryMasterBiz();

    void registerIndicator(ArkletBaseIndicator arkletBaseIndicator);
}
