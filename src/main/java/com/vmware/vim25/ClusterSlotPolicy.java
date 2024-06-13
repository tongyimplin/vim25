package com.vmware.vim25;

import com.vmware.vim25.ClusterFixedSizeSlotPolicy;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterSlotPolicy")
@XmlSeeAlso({ClusterFixedSizeSlotPolicy.class})
public class ClusterSlotPolicy extends DynamicData {}
