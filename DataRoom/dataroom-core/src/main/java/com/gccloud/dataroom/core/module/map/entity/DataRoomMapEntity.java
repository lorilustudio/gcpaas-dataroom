/*
 * Copyright 2023 http://gcpaas.gccloud.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gccloud.dataroom.core.module.map.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gccloud.common.entity.SuperEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * geo地图信息
 * @author hongyang
 * @version 1.0
 * @date 2023/8/31 13:36
 */
@Data
@Accessors(chain = true)
@TableName("big_screen_map")
@ApiModel
@ToString(callSuper = true)
public class DataRoomMapEntity extends SuperEntity {

    @ApiModelProperty(notes = "父级地图id")
    private String parentId;

    @ApiModelProperty(notes = "地图编码")
    private String mapCode;

    @ApiModelProperty(notes = "地图名称")
    private String name;

    @ApiModelProperty(notes = "地图级别 0-世界 1-国家 2-省 3-市 4-区县")
    private Integer level;

    @ApiModelProperty(notes = "geo地图数据json")
    private String geoJson;

    @ApiModelProperty(notes = "是否已上传geoJson 0-否 1-是")
    private Integer uploadedGeoJson;


}