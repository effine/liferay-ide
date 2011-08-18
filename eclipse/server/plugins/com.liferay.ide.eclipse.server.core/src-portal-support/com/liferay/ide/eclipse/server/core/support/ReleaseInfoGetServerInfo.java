/*******************************************************************************
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 *******************************************************************************/

package com.liferay.ide.eclipse.server.core.support;

import com.liferay.portal.kernel.util.ReleaseInfo;

import java.io.FileWriter;
import java.io.IOException;

public class ReleaseInfoGetServerInfo extends PortalSupport {

	@Override
	void writeOutput(FileWriter writer)
		throws IOException {

		writer.write(ReleaseInfo.getServerInfo());
	}

}
