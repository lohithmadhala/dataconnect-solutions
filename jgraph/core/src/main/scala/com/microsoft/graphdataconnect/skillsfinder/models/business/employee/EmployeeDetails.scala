package com.microsoft.graphdataconnect.skillsfinder.models.business.employee

case class EmployeeDetails(name: String,
                           location: String,
                           about: String,
                           skills: List[String],
                           currated_skills: List[String],
                           currated_about_me: List[String],
                           currated_topics: List[String],
                           //TODO: rename currated_all to skills_curated
                           currated_all: List[String],
                           upForRedeploymentDate: Option[String] = None)


