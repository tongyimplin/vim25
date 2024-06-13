package com.vmware.vim25;

import com.vmware.vim25.ClusterFailoverHostAdmissionControlInfo;
import com.vmware.vim25.ClusterFailoverLevelAdmissionControlInfo;
import com.vmware.vim25.ClusterFailoverResourcesAdmissionControlInfo;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasAdmissionControlInfo")
@XmlSeeAlso({ClusterFailoverHostAdmissionControlInfo.class, ClusterFailoverResourcesAdmissionControlInfo.class, ClusterFailoverLevelAdmissionControlInfo.class})
public class ClusterDasAdmissionControlInfo extends DynamicData {}
