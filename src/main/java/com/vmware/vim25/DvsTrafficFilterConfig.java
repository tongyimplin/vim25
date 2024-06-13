package com.vmware.vim25;

import com.vmware.vim25.DvsFilterConfig;
import com.vmware.vim25.DvsTrafficFilterConfig;
import com.vmware.vim25.DvsTrafficFilterConfigSpec;
import com.vmware.vim25.DvsTrafficRuleset;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsTrafficFilterConfig", propOrder = {"trafficRuleset"})
@XmlSeeAlso({DvsTrafficFilterConfigSpec.class})
public class DvsTrafficFilterConfig extends DvsFilterConfig {
  protected DvsTrafficRuleset trafficRuleset;
  
  public DvsTrafficRuleset getTrafficRuleset() {
    return this.trafficRuleset;
  }
  
  public void setTrafficRuleset(DvsTrafficRuleset paramDvsTrafficRuleset) {
    this.trafficRuleset = paramDvsTrafficRuleset;
  }
}
