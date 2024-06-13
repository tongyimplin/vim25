package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PerfCompositeMetric;
import com.vmware.vim25.PerfEntityMetricBase;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerfCompositeMetric", propOrder = {"entity", "childEntity"})
public class PerfCompositeMetric extends DynamicData {
  protected PerfEntityMetricBase entity;
  
  protected List<PerfEntityMetricBase> childEntity;
  
  public PerfEntityMetricBase getEntity() {
    return this.entity;
  }
  
  public void setEntity(PerfEntityMetricBase paramPerfEntityMetricBase) {
    this.entity = paramPerfEntityMetricBase;
  }
  
  public List<PerfEntityMetricBase> getChildEntity() {
    if (this.childEntity == null)
      this.childEntity = new ArrayList<>(); 
    return this.childEntity;
  }
}
