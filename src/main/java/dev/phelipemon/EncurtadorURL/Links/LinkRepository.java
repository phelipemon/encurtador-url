package dev.phelipemon.EncurtadorURL.Links;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {

    Link findByUrlShortened(String urlShortened);
}
