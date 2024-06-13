package com.vmware.vim25;

import com.vmware.vim25.DvsAcceptNetworkRuleAction;
import com.vmware.vim25.DvsCopyNetworkRuleAction;
import com.vmware.vim25.DvsDropNetworkRuleAction;
import com.vmware.vim25.DvsGreEncapNetworkRuleAction;
import com.vmware.vim25.DvsLogNetworkRuleAction;
import com.vmware.vim25.DvsMacRewriteNetworkRuleAction;
import com.vmware.vim25.DvsPuntNetworkRuleAction;
import com.vmware.vim25.DvsRateLimitNetworkRuleAction;
import com.vmware.vim25.DvsUpdateTagNetworkRuleAction;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsNetworkRuleAction")
@XmlSeeAlso({DvsDropNetworkRuleAction.class, DvsAcceptNetworkRuleAction.class, DvsRateLimitNetworkRuleAction.class, DvsPuntNetworkRuleAction.class, DvsLogNetworkRuleAction.class, DvsCopyNetworkRuleAction.class, DvsUpdateTagNetworkRuleAction.class, DvsGreEncapNetworkRuleAction.class, DvsMacRewriteNetworkRuleAction.class})
public class DvsNetworkRuleAction extends DynamicData {}
