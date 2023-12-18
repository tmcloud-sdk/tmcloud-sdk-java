package com.tmcloud.sdk.kms.v2.region;

import com.tmcloud.sdk.core.region.IRegionProvider;
import com.tmcloud.sdk.core.region.Region;
import com.tmcloud.sdk.core.region.RegionProviderChain;
import com.tmcloud.sdk.core.utils.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class KmsRegion {

    public static final Region MY_KUALALUMPUR_1 =
        new Region("my-kualalumpur-1", "https://kms.my-kualalumpur-1.alphaedge.tmone.com.my");

    private static final IRegionProvider PROVIDER = RegionProviderChain.getDefaultRegionProviderChain("KMS");

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("my-kualalumpur-1", MY_KUALALUMPUR_1);
        return Collections.unmodifiableMap(map);
    }

    public static Region valueOf(String regionId) {
        if (StringUtils.isEmpty(regionId)) {
            throw new IllegalArgumentException("Unexpected empty parameter: regionId.");
        }

        Region result = PROVIDER.getRegion(regionId);
        if (Objects.nonNull(result)) {
            return result;
        }

        result = STATIC_FIELDS.get(regionId);
        if (Objects.nonNull(result)) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected regionId: " + regionId);
    }
}
