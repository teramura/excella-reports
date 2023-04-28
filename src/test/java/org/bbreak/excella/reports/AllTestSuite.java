/*-
 * #%L
 * excella-reports
 * %%
 * Copyright (C) 2009 - 2019 bBreak Systems and contributors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package org.bbreak.excella.reports;

import org.bbreak.excella.reports.exporter.ExporterTestSuite;
import org.bbreak.excella.reports.listener.ListenerTestSuite;
import org.bbreak.excella.reports.model.ModelTestSuite;
import org.bbreak.excella.reports.others.OthersTestSuite;
import org.bbreak.excella.reports.processor.ProcessorTestSuite;
import org.bbreak.excella.reports.tag.TagTestSuite;
import org.bbreak.excella.reports.util.UtilTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * 全テスト実行用テストスイート
 * 
 * @since 1.0
 */
@RunWith(Suite.class)
@SuiteClasses({
    TagTestSuite.class,
    UtilTestSuite.class,
    ExporterTestSuite.class,
    ProcessorTestSuite.class,
    ModelTestSuite.class,
    ListenerTestSuite.class,
    OthersTestSuite.class
})
public class AllTestSuite {
    
}
