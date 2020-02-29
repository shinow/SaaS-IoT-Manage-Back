/**
 * Copyright (c) 2018-2028, Chill Zhuang 庄骞 (smallchill@163.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springblade.modules.iot.service;

import org.springblade.modules.iot.entity.Ashbin;
import org.springblade.modules.iot.vo.AshbinVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 *  服务类
 *
 * @author Blade
 * @since 2020-01-02
 */
public interface IAshbinService extends IService<Ashbin> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param ashbin
	 * @return
	 */
	IPage<AshbinVO> selectAshbinPage(IPage<AshbinVO> page, AshbinVO ashbin);


	Ashbin getAshbinStatus(String deviceId);

	Ashbin getAshbinPressData(String deviceId);
}
