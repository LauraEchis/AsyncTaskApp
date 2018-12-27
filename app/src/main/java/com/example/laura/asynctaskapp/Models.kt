package com.example.laura.asynctaskapp

import com.beust.klaxon.Json
import kotlinx.serialization.Serializable

class People(
    @Json(ignored = false) val count: Int? = 0,
    @Json(ignored = false) val next: String? = "",
    @Json(ignored = false) val previous: String? = "",
    @Json(ignored = false) val results: List<Person>? = null
)

class Planets(
    @Json(ignored = false) val count: Int? = 0,
    @Json(ignored = false) val next: String? = "",
    @Json(ignored = false) val previous: String? = "",
    @Json(ignored = false) val results: List<Planet>? = null
)

class Species(
    @Json(ignored = false) val count: Int? = 0,
    @Json(ignored = false) val next: String? = "",
    @Json(ignored = false) val previous: String? = "",
    @Json(ignored = false) val results: List<Kind>? = null
)

class Vehicles(
    @Json(ignored = false) val count: Int? = 0,
    @Json(ignored = false) val next: String? = "",
    @Json(ignored = false) val previous: String? = "",
    @Json(ignored = false) val results: List<Vehicle>? = null
)

class Starships(
    @Json(ignored = false) val count: Int? = 0,
    @Json(ignored = false) val next: String? = "",
    @Json(ignored = false) val previous: String? = "",
    @Json(ignored = false) val results: List<Starship>? = null
)

class Films(
    @Json(ignored = false) val count: Int? = 0,
    @Json(ignored = false) val next: String? = "",
    @Json(ignored = false) val previous: String? = "",
    @Json(ignored = false) val results: List<Film>? = null
)

public class Person(
    @Json(ignored = false) val name: String? = "",
    @Json(ignored = false) val height: String? = "",
    @Json(ignored = false) val mass: String? = "",
    @Json(ignored = false) val hair_color: String? = "",
    @Json(ignored = false) val skin_color: String? = "",
    @Json(ignored = false) val eye_color: String? = "",
    @Json(ignored = false) val birth_year: String? = "",
    @Json(ignored = false) val gender: String? = ""
)

public class Planet(
    @Json(ignored = false) val name: String? = "",
    @Json(ignored = false) val rotation_period: String? = "",
    @Json(ignored = false) val orbital_period: String? = "",
    @Json(ignored = false) val diameter: String? = "",
    @Json(ignored = false) val climate: String? = "",
    @Json(ignored = false) val gravity: String? = "",
    @Json(ignored = false) val terrain: String? = "",
    @Json(ignored = false) val surface_water: String? = "",
    @Json(ignored = false) val population: String? = ""
)

public class Kind(
    @Json(ignored = false) val name: String? = "",
    @Json(ignored = false) val classification: String? = "",
    @Json(ignored = false) val designation: String? = "",
    @Json(ignored = false) val average_height: String? = "",
    @Json(ignored = false) val skin_colors: String? = "",
    @Json(ignored = false) val hair_colors: String? = "",
    @Json(ignored = false) val average_lifespan: String? = "",
    @Json(ignored = false) val homeworld: String? = "",
    @Json(ignored = false) val language: String? = ""
)

public class Vehicle(
    @Json(ignored = false) val name: String? = "",
    @Json(ignored = false) val model: String? = "",
    @Json(ignored = false) val manufacturer: String? = "",
    @Json(ignored = false) val cost_in_credits: String? = "",
    @Json(ignored = false) val length: String? = "",
    @Json(ignored = false) val max_atmosphering_speed: String? = "",
    @Json(ignored = false) val crew: String? = "",
    @Json(ignored = false) val passengers: String? = "",
    @Json(ignored = false) val cargo_capacity: String? = "",
    @Json(ignored = false) val consumables: String? = "",
    @Json(ignored = false) val vehicle_class: String? = ""
)

public class Starship(
    @Json(ignored = false) val name: String? = "",
    @Json(ignored = false) val model: String? = "",
    @Json(ignored = false) val manufacturer: String? = "",
    @Json(ignored = false) val cost_in_credits: String? = "",
    @Json(ignored = false) val length: String? = "",
    @Json(ignored = false) val max_atmosphering_speed: String? = "",
    @Json(ignored = false) val crew: String? = "",
    @Json(ignored = false) val passengers: String? = "",
    @Json(ignored = false) val cargo_capacity: String? = "",
    @Json(ignored = false) val consumables: String? = "",
    @Json(ignored = false) val hyperdrive_rating: String? = "",
    @Json(ignored = false) val mglt: String? = "",
    @Json(ignored = false) val starship_class: String? = ""

)

public class Film (
    @Json(ignored = false) val title: String? = "",
    @Json(ignored = false) val episode_id: Int? = 0,
////    @Json(ignored = false) val opening_crawl: String? = "",
    @Json(ignored = false) val director: String? = "",
    @Json(ignored = false) val producer: String? = "",
    @Json(ignored = false) val release_date: String? = ""
)
