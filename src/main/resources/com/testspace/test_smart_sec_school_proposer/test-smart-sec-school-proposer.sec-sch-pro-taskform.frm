{"id":"1b347a80-3c05-4d0f-ba56-149437fb1d07","name":"test-smart-sec-school-proposer.sec-sch-pro-taskform","model":{"processName":"sec-sch-pro","processId":"test-smart-sec-school-proposer.sec-sch-pro","name":"process","properties":[{"name":"school","typeInfo":{"type":"OBJECT","className":"com.testspace.test_smart_sec_school_proposer.School","multiple":false},"metaData":{"entries":[]}},{"name":"schoolChoiceCollection","typeInfo":{"type":"OBJECT","className":"com.testspace.test_smart_sec_school_proposer.SchoolCollection","multiple":false},"metaData":{"entries":[]}},{"name":"schoolCollection","typeInfo":{"type":"OBJECT","className":"com.testspace.test_smart_sec_school_proposer.SchoolCollection","multiple":false},"metaData":{"entries":[]}},{"name":"student","typeInfo":{"type":"OBJECT","className":"com.testspace.test_smart_sec_school_proposer.Student","multiple":false},"metaData":{"entries":[]}}],"formModelType":"org.kie.workbench.common.forms.jbpm.model.authoring.process.BusinessProcessFormModel"},"fields":[{"nestedForm":"54a1e5fc-f5e8-4a91-adec-74a5559bc289","container":"FIELD_SET","id":"field_648863033925179E11","name":"student","label":"Student","required":false,"readOnly":false,"validateOnChange":true,"helpMessage":"","binding":"student","standaloneClassName":"com.testspace.test_smart_sec_school_proposer.Student","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"},{"nestedForm":"659c1496-bef4-4b58-9c4b-0ce24f3abcd0","container":"FIELD_SET","id":"field_9533","name":"schoolChoiceCollection","label":"SchoolChoiceCollection","required":false,"readOnly":true,"validateOnChange":true,"helpMessage":"","binding":"schoolChoiceCollection","standaloneClassName":"com.testspace.test_smart_sec_school_proposer.SchoolCollection","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"}],"layoutTemplate":{"version":2,"style":"FLUID","layoutProperties":{},"rows":[{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_648863033925179E11","form_id":"1b347a80-3c05-4d0f-ba56-149437fb1d07"}}]}]},{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_9533","form_id":"1b347a80-3c05-4d0f-ba56-149437fb1d07"}}]}]}]}}